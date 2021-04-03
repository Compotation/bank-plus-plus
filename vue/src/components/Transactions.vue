<template>
  <table>
    <thead>
      <tr>
        <th>Date of Transaction</th>
        <th>Amount</th>
        <th>Merchant</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="(transaction, index) in transactions" :key="index">
        <td>{{ transaction.date }}</td>
        <td>{{ transaction.amount }}</td>
        <td>{{ transaction.merchant }}</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
import AccountService from "@/services/account-service.js";
export default {
  name: "Transactions",
  props: ["accountId"],
  data() {
    return {
      transactions: null,
    };
  },
  mounted() {
    this.fetchTransactions();
  },
  methods: {
    fetchTransactions() {
      AccountService.getAccount(this.accountId).then(
        (data) => (this.transactions = data.transactions)
      );
    },
  },
};
</script>
