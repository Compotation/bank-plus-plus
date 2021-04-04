import APIService from "@/services/api-service.js";
export default {
  getAccounts() {
    return APIService.get("/accounts");
  },

  postNewAccount(name, startingBalance) {
    return APIService.post(
      `/accounts?name=${encodeURIComponent(
        name
      )}&startingBalance=${startingBalance}`
    );
  },

  getAccount(id) {
    return APIService.get("/" + id);
  },
};
