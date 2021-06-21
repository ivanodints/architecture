package ru.geekbrains.art_shop;




import ru.geekbrains.service.ProductRepr;

import javax.persistence.*;

@Entity
@Table(name = "basket")
public class BasketProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String  category;


    @Column(nullable = false)
    private String title;


    @Column(nullable = false)
    private Integer price;

    public BasketProduct() {
    }

    public BasketProduct(String category, String title, Integer price) {
        this.category = category;
        this.title = title;
        this.price = price;
    }

    public BasketProduct(ProductRepr productRepr) {
        this.id = productRepr.getId();
        this.category = productRepr.getCategory();
        this.title = productRepr.getTitle();
        this.price = productRepr.getPrice();
    }


    public BasketProduct(Product product) {
        this.id = product.getId();
        this.category = product.getCategory();
        this.title = product.getTitle();
        this.price = product.getPrice();
    }

    public BasketProduct(BasketProduct basketProduct) {
        this.id = basketProduct.getId();
        this.category = basketProduct.getCategory();
        this.title = basketProduct.getTitle();
        this.price = basketProduct.getPrice();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public void setPrice(Integer price) {
        this.price = price;
    }
}