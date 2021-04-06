<template>
  <table>
    <thead>
      <tr>
        <th>Date of Transaction</th>
        <th>Name of Stock</th>
        <th>Price</th>
        <th>Quantity</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="(transaction, index) in transactions" :key="index">
        <td>{{ transaction.date }}</td>
        <td>{{ transaction.stock }}</td>
        <td>{{ transaction.amount }}</td>
        <td>{{ transaction.quantity }}</td>
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
