<template>
  <div class="buy-container">
    <button @click="refresh">Refresh</button>
    <label for="stock-select">Select a stock to buy:</label>
    <select id="stock-select" name="stocks">
      <option value="">Please select a stock</option>

      <option v-for="stock in stocks" :key="stock" :value="stock">
        {{ stock }}
      </option>
    </select>

    <label for="account-select">Account:</label>
    <select id="account-select" name="accounts">
      <option value="">Please select an account</option>

      <option v-for="account in accounts" :key="account" :value="account">
        {{ account.name }} (${{ account.balance }})
      </option>
    </select>

    <button>Buy</button>
  </div>
</template>

<script>
export default {
  name: "BuyStock",
  data() {
    return {
      stocks: [],
      accounts: [],
    };
  },

  methods: {
    getStocks() {
      fetch(process.env.VUE_APP_API + "/stocks")
        .then((response) => response.json())
        .then((data) => (this.stocks = data));
    },
    getAccounts() {
      fetch(process.env.VUE_APP_API + "/accounts")
        .then((response) => response.json())
        .then((data) => (this.accounts = data));
    },
    refresh() {
      this.getStocks();
      this.getAccounts();
    },
  },
};
</script>

<style scoped>
.buy-container {
  display: flex;
  flex-direction: column;
  align-items: center;
}
</style>