package com.rakuten.parser;

public class Item {
    private final String name;
    private final String category;
    private final String price;

    public Item(String name, String category, String price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getPrice() {
        return price;
    }

}
