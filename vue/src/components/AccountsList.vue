<template>
  <button @click="getAccounts">Refresh</button>
  <table>
    <thead>
      <tr>
        <th>Name of Account</th>
        <th>Balance</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="(account, index) in accounts" :key="index">
        <td>
          <router-link :to="'/accounts/' + account.name">{{
            account.name
          }}</router-link>
        </td>
        <td>{{ account.balance }}</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: "AccountsList",
  data() {
    return {
      accounts: [],
    };
  },
  methods: {
    getAccounts() {
      fetch(process.env.VUE_APP_API + "/accounts")
        .then((response) => response.json())
        .then((data) => (this.accounts = data));
    },
  },
};
</script>