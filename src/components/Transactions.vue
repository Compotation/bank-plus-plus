<template>
  <table>
    <thead>
      <tr>
        <th>Date of Transaction</th>
        <th>Amount</th>
        <th>Merchant</th>
      </tr>
    </thead>
  </table>
</template>

<script>
export default {
  name: "Transactions",
  data() {
    return {
      transactions: [],
    };
  },
};
</script>
