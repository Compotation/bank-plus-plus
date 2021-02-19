<template>
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
      accounts: [{ name: "First Account", balance: 200, transactionsList: [] }],
    };
  },
};
</script>