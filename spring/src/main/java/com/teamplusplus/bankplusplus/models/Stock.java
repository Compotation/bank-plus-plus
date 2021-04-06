package com.teamplusplus.bankplusplus.models;

public class Stock {
    private String name;
    private String ticker;
    private double value;
    private double percent;

    public Stock(String name, String ticker, double value, double percent) {
        this.name = name;
        this.ticker = ticker;
        this.value = value;
    }

    public Stock(String name, double value, double percent) {
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

    public double getPercent() {
        return percent;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setTicker(String newTicker) {
        this.ticker = newTicker;
    }

    public void setValue(double newValue) {
        this.value = newValue;
    }

    public void setPercent(double newPercent) {
        this.percent = newPercent;
    }

    // public void updateValue() {
    //     if (Math.random < 0.5)
    //         setTicker(value * (1+percent));
    //     setTicker(value * (1-percent));
    // }

    public String makeTicker(String name) {
        String newName = "";

        if (newName == name) {
            return "INVALID";
        }

        name = name.toUpperCase();

        /* removes all whitespaces and
         * non-visible characters
         * (e.g., tab, \n)
         * (n^2)
         */
        name = name.replaceAll("\\s", "");
        // alternatively(n*log(n)):
        // name = name.replaceAll("\\s+", "");

        if (name.length() <= 5) {
            return name;
        }

        // if (name.startsWith("A")
        //  || name.startsWith("E")
        //  || name.startsWith("I")
        //  || name.startsWith("O")
        //  || name.startsWith("U")
        // )

        /* ^ - start of String
         * [AEIOU] - find character from options in brackets
         * .* - followed by any characters
         * $ - end of String
         */
        if (name.matches("^[AEIOU].*$"))
            newName += name.substring(0, 1);

        newName += name.replaceAll("[AEIOU]", "");

        newName = (newName.length() >= 5) ? newName.substring(0, 5) : newName;

        return newName;
    }

    public String[] toArray() {
        return new String[]{name, ticker, String.valueOf(value)};
    }
}
