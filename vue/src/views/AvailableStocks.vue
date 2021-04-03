<template>
  <div>
    <Button @click="getStocks" icon="pi pi-refresh" />

    <DataView :value="stocks" :layout="layout">
      <template #header>
        <DataViewLayoutOptions v-model="layout"></DataViewLayoutOptions>
      </template>

      <template #list="slotProps">
        <Card class="stock-card">
          <template #title> {{ slotProps.data[1] }} </template>
          <template #subtitle>{{ slotProps.data[0] }}</template>
          <template #content>{{ moneyFormat(slotProps.data[2]) }}</template>
        </Card>
      </template>

      <template #grid="slotProps">
        <Card class="stock-card">
          <template #title> {{ slotProps.data[1] }} </template>
          <template #subtitle>{{ slotProps.data[0] }}</template>
          <template #content>{{ moneyFormat(slotProps.data[2]) }}</template>
        </Card>
      </template>
    </DataView>
  </div>
</template>

<script>
import DataView from "primevue/dataview";
import DataViewLayoutOptions from "primevue/dataviewlayoutoptions";
import Card from "primevue/card";
import TransactionService from "@/services/transaction-service.js";

export default {
  name: "AvailableStocks",
  components: {
    DataView,
    DataViewLayoutOptions,
    Card,
  },
  data() {
    return {
      stocks: null,
    };
  },
  methods: {
    getStocks() {
      TransactionService.getStocks().then((data) => (this.stocks = data));
    },
    moneyFormat(value) {
      return "$" + parseFloat(value).toFixed(2);
    },
  },
  mounted() {
    this.getStocks();
  },
};
</script>

<style scoped>
.stock-card {
  margin: 1rem 1rem 1rem 1rem;
  padding-right: 2rem;
  padding-left: 2rem;
}
</style>
