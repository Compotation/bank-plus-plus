export default {
  getAccounts() {
    return fetch(process.env.VUE_APP_API + "/accounts", {
      credentials: "include",
    }).then((response) => response.json());
  },

  postNewAccount(name) {
    fetch(process.env.VUE_APP_API + "/accounts" + "?name=" + name, {
      method: "POST",
    });
  },

  getAccount(id) {
    return fetch(process.env.VUE_APP_API + "/" + id, {
      credentials: "include",
    }).then((response) => response.json());
  },
};
