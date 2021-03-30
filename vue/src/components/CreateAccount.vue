<template>
  <label for="name">Name of Account</label>
  <input id="name" v-model="accountName" required type="text" />

  <button @click="createAccount">Create</button>
</template>

<script>
export default {
  name: "CreateAccount",
  data() {
    return {
      accountName: "",
    };
  },
  methods: {
    createAccount() {
      fetch(
        process.env.VUE_APP_API + "/accounts" + "?name=" + this.accountName,
        {
          method: "POST",
        }
      );
    },
  },
};
</script>

<style scoped></style>
