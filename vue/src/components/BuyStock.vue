<template>
  <label for="stock-select">Select a stock to buy:</label>
  <select id="stock-select" name="stocks">
    <option value="">Please select a stock</option>

    <option v-for="stock in stocks" :key="stock" value="{{stock}}">
      {{ stock }}
    </option>
  </select>

  <label for="account-select">Account:</label>
  <select id="account-select" name="accounts">
    <option value="">Please select an account</option>

    <option v-for="account in accounts" :key="account" :value="account">
      {{ account }}
    </option>
  </select>

  <button>Buy</button>
</template>

<script>
export default {
  name: "BuyStock",
  data() {
    return {
      stocks: ["GOOGL", "GME", "APPL"],
      accounts: { rand1: 41.2, rand2: 0.0 },
    };
  },
};
</script>

<style scoped></style>