import { createRouter, createWebHistory } from "vue-router";
import Home from "@/views/Home";
import AccountsList from "@/views/AccountsList";
import ManageAccount from "@/views/ManageAccount";
import BuyStock from "@/views/BuyStock";
import AvailableStocks from "@/views/AvailableStocks";

const routes = [
  { path: "/", component: Home },
  { path: "/accounts", component: AccountsList },
  { path: "/accounts/:id", component: ManageAccount },
  { path: "/buy", component: BuyStock },
  { path: "/stocks", component: AvailableStocks },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
