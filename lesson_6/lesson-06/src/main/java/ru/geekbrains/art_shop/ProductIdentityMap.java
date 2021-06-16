package ru.geekbrains.art_shop;

import java.util.HashMap;
import java.util.Map;

public class ProductIdentityMap {

    private static Map<Long, Product> productMap = new HashMap<>();

    public static void addProduct(Product product){
        productMap.put(product.getId(), product);
    }

    public static Product getProduct(Long id){
        return productMap.get(id);
    }
}
