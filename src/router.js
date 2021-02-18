import { createRouter, createWebHistory } from "vue-router";
import Home from "@/views/Home";
import Accounts from "@/views/Accounts";

const routes = [
  { path: "/", component: Home },
  { path: "/accounts", component: Accounts },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
