import { createRouter, createWebHistory } from "vue-router";
import Home from "@/views/Home";
import ViewAllAccounts from "@/views/ViewAllAccounts";
import ManageAccount from "@/views/ManageAccount";
import Buy from "@/views/Buy";

const routes = [
  { path: "/", component: Home },
  { path: "/accounts", component: ViewAllAccounts },
  { path: "/accounts/:id", component: ManageAccount },
  { path: "/buy", component: Buy },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
