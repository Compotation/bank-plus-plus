<template #list="slotProps">
  <Button @click="getAccounts" class="pi pi-refresh" />

  <Toolbar class="p-mb-4">
    <template #left>
      <Button label="New" icon="pi pi-plus" class="p-button-success p-mr-2" />
    </template>
  </Toolbar>

  <!-- TODO sort by id -->
  <DataTable ref="dt" :value="accounts" dataKey="name">
    <Column field="name" header="Name" :sortable="true"></Column>
    <Column field="balance" header="Balance" :sortable="true"></Column>
  </DataTable>
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
