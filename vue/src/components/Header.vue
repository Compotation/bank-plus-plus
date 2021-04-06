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
      <li>
        <a :href="api + '/export'" target="_blank">Export</a>
      </li>
    </ul>

    <div id="status">
      <label>Login Status: </label>
      <Avatar :icon="avatarIcon" size="large" />
    </div>
  </nav>
</template>

<script>
import Avatar from "primevue/avatar";
import APIService from "@/services/api-service.js";

export default {
  name: "Header",
  components: { Avatar },
  data() {
    return {
      avatarIcon: "pi pi-spin pi-spinner",
      api: process.env.VUE_APP_API,
    };
  },
  mounted() {
    APIService.get("/time").then(
      () => (this.avatarIcon = "pi pi-check-square")
    );
  },
};
</script>

<style scoped>
nav {
  display: flex;
  flex-direction: row;
  align-items: center;
}
#status {
  margin-left: auto;
  margin-right: 15vw;
}
ul {
  list-style-type: none;
  display: flex;
}
li {
  display: flex;
  flex-direction: row;
  margin: 1rem;

  border: aqua 1px solid;
  padding: 1rem;
  background-color: bisque;
}
</style>
