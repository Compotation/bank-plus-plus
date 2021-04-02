import { createApp } from "vue";
import App from "./App.vue";
import PrimeVue from "primevue/config";
import router from "@/router";
import Button from "primevue/button";
import InputText from "primevue/inputtext";
import Dropdown from "primevue/dropdown";
import Toolbar from "primevue/toolbar";
import DataTable from "primevue/datatable";
import Column from "primevue/column";
import Dialog from "primevue/dialog";
import "primevue/resources/themes/mdc-light-indigo/theme.css";
import "primevue/resources/primevue.min.css";
import "primeicons/primeicons.css";
import "primeflex/primeflex.css";

const app = createApp(App);
app.use(router).use(PrimeVue);
app
  .component("Button", Button)
  .component("InputText", InputText)
  .component("Toolbar", Toolbar)
  .component("Dropdown", Dropdown)
  .component("DataTable", DataTable)
  .component("Dialog", Dialog)
  .component("Column", Column);
app.mount("#app");
