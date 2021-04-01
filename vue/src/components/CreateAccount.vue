<template>
  <div class="p-formgroup-inline">
    <div class="p-field">
      <label for="name">Name of Account</label>
      <InputText id="name" type="text" v-model="accountName" />
    </div>

    <Button @click="createAccount">Create</Button>
  </div>
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
