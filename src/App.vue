<template>
  <accounts-list />
</template>

<script>
import AccountsList from "./components/AccountsList.vue";

export default {
  name: "App",
  components: {
    AccountsList,
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
