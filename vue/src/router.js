import { createRouter, createWebHistory } from "vue-router";
import Home from "@/views/Home";
import ViewAllAccounts from "@/views/ViewAllAccounts";
import ManageAccount from "@/views/ManageAccount";

const routes = [
  { path: "/", component: Home },
  { path: "/accounts", component: ViewAllAccounts },
  { path: "/accounts/:id", component: ManageAccount },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
