<template>
  <h1>Account {{ $route.params.id }}</h1>
  <Transactions />
</template>

<script>
import Transactions from "@/components/Transactions";

export default {
  name: "ManageAccount",
  components: { Transactions },
};
</script>

<style scoped></style>
