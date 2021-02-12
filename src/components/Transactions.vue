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
export default {
  name: "Transactions",
  data() {
    return {
      transactions: [
        {
          date: "2021-02-12T16:02:24.026590672",
          amount: 21.5,
          merchant: "Apple",
        },
      ],
    };
  },
};
</script>
