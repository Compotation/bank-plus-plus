<template>
  <accounts-list />
  <transactions />
</template>

<script>
import AccountsList from "./components/AccountsList.vue";
import Transactions from "./components/Transactions.vue";

export default {
  name: "App",
  components: {
    AccountsList,
    Transactions,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
