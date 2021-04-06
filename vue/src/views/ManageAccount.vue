<template>
  <Card>
    <template #title> Account {{ $route.params.id }} </template>
    <template #content
      ><Button label="Deposit" @click="this.depositing = true"
    /></template>
  </Card>

  <Dialog v-model:visible="depositing" header="Deposit Money" :modal="true">
    <div class="p-field">
      <label for="amount">Amount</label>
      <InputNumber
        v-model="amountToDeposit"
        :min="0"
        mode="currency"
        currency="USD"
        locale="en-US"
      />
    </div>
    <template #footer>
      <Button
        label="Cancel"
        icon="pi pi-times"
        class="p-button-text"
        @click="this.depositing = false"
      />
      <Button
        label="Deposit"
        icon="pi pi-check"
        class="p-button-text"
        @click="deposit"
      />
    </template>
  </Dialog>

  <Transactions :accountId="$route.params.id" />
</template>

<script>
import Transactions from "@/components/Transactions";
import Card from "primevue/card";
import InputNumber from "primevue/inputnumber";
import TransactionService from "@/services/transaction-service.js";

export default {
  name: "ManageAccount",
  components: { Transactions, Card, InputNumber },
  data() {
    return {
      depositing: false,
    };
  },
  methods: {
    deposit() {
      TransactionService.deposit(
        this.$route.params.id,
        this.amountToDeposit
      ).then(() => (this.depositing = false));
    },
  },
};
</script>

<style scoped></style>
