package ru.geekbrains.art_shop;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Product {

    private long id;
    @NotEmpty
    private String  category;
    @NotEmpty
    private String title;
    @NotNull
    private int price;

    public Product() {
    }

    public Product(String category, String title, int price) {
        this.category = category;
        this.title = title;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}