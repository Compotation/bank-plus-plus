<template>
  <div>
    <Button @click="getStocks">Refresh</Button>

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
  </div>
</template>

<script>
export default {
  name: "AvailableStocks",
  data() {
    return {
      data() {
        return {
          stocks: [[2, 3, 3]],
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
