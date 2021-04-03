<template>
  <nav>
    <ul>
      <li>
        <router-link to="/">Home</router-link>
      </li>
      <li>
        <router-link to="/accounts">Accounts</router-link>
      </li>
      <li>
        <router-link to="/buy">Buy</router-link>
      </li>
      <li>
        <router-link to="/stocks">Stock Info</router-link>
      </li>
    </ul>
  </nav>
</template>

<script>
export default {
  name: "Header",
};
</script>

<style scoped>
ul {
  list-style-type: none;
  display: flex;
}
li {
  display: flex;
  flex-direction: row;
  margin: 1rem;
}
</style>
