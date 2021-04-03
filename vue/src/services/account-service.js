export default {
  get(endpoint) {
    return fetch(process.env.VUE_APP_API + endpoint, {
      credentials: "include",
    }).then((response) => response.json());
  },

  post(endpoint) {
    return fetch(process.env.VUE_APP_API + endpoint, {
      credentials: "include",
      method: "POST",
    });
  },

  getAccounts() {
    return this.get("/accounts");
  },

  postNewAccount(name) {
    return this.post("/accounts?name=" + encodeURIComponent(name));
  },

  getAccount(id) {
    return this.get("/" + id);
  },
};
