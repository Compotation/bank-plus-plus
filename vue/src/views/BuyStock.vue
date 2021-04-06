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
          <abbr
            >{{ slotProps.option[1] }} at ${{
              moneyFormat(slotProps.option[2])
            }}</abbr
          >
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

    <label for="amount">Quantity to Buy</label>
    <InputNumber v-model="quantityToBuy" showButtons :min="1" />

    <Button
      label="Buy"
      icon="pi pi-shopping-cart"
      iconPos="right"
      @click="buyAndRefresh"
    />
  </div>
</template>

<script>
import InputNumber from "primevue/inputnumber";
import TransactionService from "@/services/transaction-service.js";
import AccountService from "@/services/account-service.js";

export default {
  name: "BuyStock",
  components: { InputNumber },
  data() {
    return {
      stocks: [],
      accounts: [],
      selectedStock: null,
      selectedAccount: null,
      quantityToBuy: null,
    };
  },

  methods: {
    getStocks() {
      TransactionService.getStocks().then((data) => (this.stocks = data));
    },
    getAccounts() {
      AccountService.getAccounts().then((data) => (this.accounts = data));
    },
    refresh() {
      this.getStocks();
      this.getAccounts();
    },
    buyAndRefresh() {
      TransactionService.buyStock(
        this.selectedAccount.id,
        this.selectedStock[1],
        this.quantityToBuy
      ).then(() => this.refresh());
    },
    moneyFormat(value) {
      return parseFloat(value).toFixed(2);
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
