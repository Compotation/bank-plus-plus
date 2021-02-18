import { createRouter, createWebHistory } from "vue-router";
import Home from "@/views/Home";
import Accounts from "@/views/Accounts";
import AccountView from "@/views/AccountView";

const routes = [
  { path: "/", component: Home },
  { path: "/accounts", component: Accounts },
  { path: "/accounts/:id", component: AccountView },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
