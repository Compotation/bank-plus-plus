<template>
  <Card>
    <template #title> Account {{ $route.params.id }} </template>
    <template #content><Button label="Deposit" /></template>
  </Card>
  <Transactions :accountId="$route.params.id" />
</template>

<script>
import Transactions from "@/components/Transactions";
import Card from "primevue/card";

export default {
  name: "ManageAccount",
  components: { Transactions, Card },
};
</script>

<style scoped></style>
