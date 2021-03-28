package com.teamplusplus.bankplusplus.models;

public class Stock {
    private String name;
    private String ticker;
    private double value;

    public Stock(String name, String ticker, double value) {
        this.name = name;
        this.ticker = ticker;
        this.value = value;
    }

    public Stock(String name, double value) {
        this.name = name;
        this.ticker = makeTicker(name);
        this.value = value;
    }

    public getName() {
        return name;
    }

    public getTicker() {
        return ticker;
    }

    public getValue() {
        return value;
    }

    public String makeTicker(String name) {
        String newName = "";
        name = name.toUpperCase();

        if (  name.startsWith("A")
            ||name.startsWith("E")
            ||name.startsWith("I")
            ||name.startsWith("O")
            ||name.startsWith("U")
            )
            newName += name.substring(0,1);

        newName += name.replaceAll("[AEIOU]", "");

        return newName;
    }
}
