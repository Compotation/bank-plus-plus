package com.teamplusplus.bankplusplus.models;

public class Stock {
    private final String name;
    private final String ticker;
    private final double value;

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

    public String getName() {
        return name;
    }

    public String getTicker() {
        return ticker;
    }

    public double getValue() {
        return value;
    }

    public String makeTicker(String name) {
        String newName = "";
        name = name.toUpperCase();

        if (  name.startsWith("A")
            ||name.startsWith("E")
            || name.startsWith("I")
            || name.startsWith("O")
            || name.startsWith("U")
        )
            newName += name.substring(0, 1);

        newName += name.replaceAll("[AEIOU]", "");

        return newName;
    }

    public String[] toArray() {
        return new String[]{name, ticker, String.valueOf(value)};
    }
}
