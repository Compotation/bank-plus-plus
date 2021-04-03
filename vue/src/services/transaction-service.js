import APIService from "@/services/api-service.js";
export default {
  buyStock(account, ticker, amount) {
    return APIService.post(
      `/${account}/transactions?stock=${ticker}&amount=${amount}`
    );
  },
  getStocks() {
    return APIService.get("/stocks");
  },
};
