<template>
  <div>
    <Button @click="getAccounts" icon="pi pi-refresh" />

    <Toolbar class="p-mb-4">
      <template #left>
        <Button
          label="New"
          icon="pi pi-plus"
          class="p-button-success p-mr-2"
          @click="openNew"
        />
      </template>
    </Toolbar>

    <!-- TODO sort by id -->
    <DataTable ref="dt" :value="accounts" dataKey="name">
      <Column field="name" header="Name" :sortable="true"></Column>
      <Column field="balance" header="Balance" :sortable="true"></Column>
    </DataTable>

    <Dialog
      v-model:visible="makingNewAccount"
      header="New Account"
      :modal="true"
      :style="{ width: '450px' }"
      class="p-fluid"
    >
      <div class="p-formgroup-inline">
        <div class="p-field">
          <label for="name">Name of Account</label>
          <InputText id="name" type="text" v-model="accountName" />
        </div>
      </div>
      <template #footer>
        <Button
          label="Cancel"
          icon="pi pi-times"
          class="p-button-text"
          @click="this.makingNewAccount = false"
        />
        <Button
          label="Create"
          icon="pi pi-check"
          class="p-button-text"
          @click="createAccount"
        />
      </template>
    </Dialog>
  </div>
</template>

<script>
export default {
  name: "AccountsList",
  data() {
    return {
      accounts: [],
      makingNewAccount: false,
    };
  },
  methods: {
    getAccounts() {
      fetch(process.env.VUE_APP_API + "/accounts")
        .then((response) => response.json())
        .then((data) => (this.accounts = data));
    },
    openNew() {
      this.makingNewAccount = true;
    },
    closeNew() {
      this.makingNewAccount = false;
    },
    createAccount() {
      this.makingNewAccount = false;
      fetch(
        process.env.VUE_APP_API + "/accounts" + "?name=" + this.accountName,
        {
          method: "POST",
        }
      );
    },
  },
  mounted() {
    this.getAccounts();
  },
};
</script>
