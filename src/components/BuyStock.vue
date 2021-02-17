<template>
  <label for="stock-select"></label>

  <select id="stock-select" name="stocks">
    <option value="">Please select a stock</option>

    <option v-for="stock in stocks" :key="stock" value="{{stock}}">
      {{ stock }}
    </option>
  </select>

  <button>Buy</button>
</template>

<script>
export default {
  name: "BuyStock",
  data() {
    return {
      stocks: ["GOOGL", "GME", "APPL"],
    };
  },
};
</script>

<style scoped></style>