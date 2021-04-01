<template>
  <button @click="getAccounts">Refresh</button>
  <table>
    <thead>
      <tr>
        <th>Name of Account</th>
        <th>Balance</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="(account, index) in accounts" :key="index">
        <td>
          <router-link :to="'/accounts/' + account.name">{{
            account.name
          }}</router-link>
        </td>
        <td>{{ account.balance }}</td>
      </tr>
    </tbody>
  </table>
  <Card>
    <template #header>
      <img alt="user header" src="demo/images/usercard.png" />
    </template>
    <template #title> Advanced Card </template>
    <template #content>
      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore sed
      consequuntur error repudiandae numquam deserunt quisquam repellat libero
      asperiores earum nam nobis, culpa ratione quam perferendis esse,
      cupiditate neque quas!
    </template>
    <template #footer>
      <Button icon="pi pi-check" label="Save" />
      <Button
        icon="pi pi-times"
        label="Cancel"
        class="p-button-secondary"
        style="margin-left: 0.5em"
      />
    </template>
  </Card>
</template>

<script>
export default {
  name: "AccountsList",
  data() {
    return {
      accounts: [],
    };
  },
  methods: {
    getAccounts() {
      fetch(process.env.VUE_APP_API + "/accounts")
        .then((response) => response.json())
        .then((data) => (this.accounts = data));
    },
  },
};
</script>
