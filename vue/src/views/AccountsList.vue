<template>
  <div>
    <Button @click="fetchAccounts" icon="pi pi-refresh" />

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

    <DataTable ref="dt" :value="accounts" dataKey="name">
      <Column field="name" header="Name" :sortable="true">
        <template #body="slotProps">
          <router-link :to="'/accounts/' + slotProps.data.id">{{
            slotProps.data.name
          }}</router-link>
        </template>
      </Column>
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

        <div class="p-field">
          <label for="startingBalance">Starting Balance</label>
          <InputNumber
            v-model="startingBalance"
            :min="0"
            mode="currency"
            currency="USD"
            locale="en-US"
          />
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
import AccountService from "@/services/account-service.js";
import InputNumber from "primevue/inputnumber";

export default {
  name: "AccountsList",
  components: { InputNumber },
  data() {
    return {
      accounts: null,
      makingNewAccount: false,
    };
  },
  methods: {
    fetchAccounts() {
      AccountService.getAccounts().then((data) => (this.accounts = data));
    },
    openNew() {
      this.makingNewAccount = true;
    },
    closeNew() {
      this.makingNewAccount = false;
    },
    createAccount() {
      this.makingNewAccount = false;
      AccountService.postNewAccount(
        this.accountName,
        this.startingBalance
      ).then(() => this.fetchAccounts());
    },
  },
  mounted() {
    this.fetchAccounts();
  },
};
</script>
