import APIService from "@/services/api-service.js";
export default {
  getAccounts() {
    return APIService.get("/accounts");
  },

  postNewAccount(name) {
    return APIService.post("/accounts?name=" + encodeURIComponent(name));
  },

  getAccount(id) {
    return APIService.get("/" + id);
  },
};
