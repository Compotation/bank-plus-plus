<template>
  <button @click="getStocks">Refresh</button>

  <table>
    <thead>
      <tr>
        <th>Company</th>
        <th>Ticker</th>
        <th>Price</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="stock in stocks" :key="stock">
        <td>{{ stock[0] }}</td>
        <td>{{ stock[1] }}</td>
        <td>{{ stock[2] }}</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: "AvailableStocks",
  data() {
    return {
      data() {
        return {
          stocks: [],
        };
      },
    };
  },
  methods: {
    getStocks() {
      fetch(process.env.VUE_APP_API + "/stocks")
        .then((response) => response.json())
        .then((data) => (this.stocks = data));
    },
  },
};
</script>

<style scoped></style>
