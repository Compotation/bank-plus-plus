import { createApp } from "vue";
import App from "./App.vue";
import PrimeVue from "primevue/config";
import router from "@/router";
import Button from "primevue/button";
import DataView from "primevue/dataview";
import Panel from "primevue/panel";
import InputText from "primevue/inputtext";
import "primevue/resources/themes/mdc-light-indigo/theme.css";
import "primevue/resources/primevue.min.css";
import "primeicons/primeicons.css";
import "primeflex/primeflex.css";

const app = createApp(App);
app.use(router).use(PrimeVue);
app
  .component("Button", Button)
  .component("DataView", DataView)
  .component("Panel", Panel)
  .component("InputText", InputText);
app.mount("#app");
