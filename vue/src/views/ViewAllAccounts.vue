<template>
  <AccountsList></AccountsList>
  <CreateAccount></CreateAccount>
</template>

<script>
import AccountsList from "@/components/AccountsList";
import CreateAccount from "@/components/CreateAccount";

export default {
  name: "Accounts",
  components: { CreateAccount, AccountsList },
};
</script>

<style scoped></style>