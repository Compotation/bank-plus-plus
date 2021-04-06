import APIService from "@/services/api-service.js";
export default {
  buyStock(account, ticker, quantity) {
    return APIService.post(
      `/${account}/transactions?stock=${ticker}&quantity=${quantity}`
    );
  },
  getStocks() {
    return APIService.get("/stocks");
  },
  deposit(account, amount) {
    return APIService.post(`/${account}/deposits?amount=${amount}`);
  },
};
