<template>
  <div class="buy-container">
    <Button @click="refresh" icon="pi pi-refresh" />

    <label for="stock-select">Select a stock to buy:</label>
    <Dropdown
      v-model="selectedStock"
      :options="stocks"
      optionLabel="1"
      placeholder="Select a stock"
      id="stock-select"
    >
      <template #option="slotProps">
        <div>
          <abbr>{{ slotProps.option[1] }} at ${{ slotProps.option[2] }}</abbr>
        </div>
      </template>
    </Dropdown>

    <label for="account-select">Select an account to buy with:</label>
    <Dropdown
      v-model="selectedAccount"
      :options="accounts"
      optionLabel="name"
      placeholder="Select an account"
    >
      <template #option="slotProps">
        <div>
          <span>
            {{ slotProps.option.name }} with ${{
              slotProps.option.balance
            }}</span
          >
        </div>
      </template>
    </Dropdown>

    <label for="amount">Amount of Stocks to Buy</label>
    <InputNumber v-model="amountToBuy" showButtons :min="1" />

    <Button label="Buy" icon="pi pi-shopping-cart" iconPos="right" />
  </div>
</template>

<script>
import InputNumber from "primevue/inputnumber";

export default {
  name: "BuyStock",
  components: { InputNumber },
  data() {
    return {
      stocks: [],
      accounts: [],
      selectedStock: null,
      selectedAccount: null,
      amountToBuy: null,
    };
  },

  methods: {
    getStocks() {
      fetch(process.env.VUE_APP_API + "/stocks", { credentials: "include" })
        .then((response) => response.json())
        .then((data) => (this.stocks = data));
    },
    getAccounts() {
      fetch(process.env.VUE_APP_API + "/accounts", { credentials: "include" })
        .then((response) => response.json())
        .then((data) => (this.accounts = data));
    },
    refresh() {
      this.getStocks();
      this.getAccounts();
    },
  },
  mounted() {
    this.refresh();
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
