<template #list="slotProps">
  <Button @click="getAccounts" class="pi pi-refresh" />
  <DataView :value="accounts" :layout="layout">
    <template #header>
      <DataViewLayoutOptions v-model="layout"></DataViewLayoutOptions>
    </template>
    <template #list="slotProps">
      <Panel
        :header="slotProps.data.name"
        style="text-align: center; margin: 20px"
      >
        <div>${{ slotProps.data.balance }}</div>
        <Button icon="pi pi-link"></Button>
      </Panel>
    </template>

    <template #grid="slotProps">
      <Panel :header="slotProps.data.name" style="text-align: center">
        <div>${{ slotProps.data.balance }}</div>
        <Button icon="pi pi-link"></Button>
      </Panel>
    </template>
  </DataView>
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
  mounted() {
    this.getAccounts();
  },
};
</script>
