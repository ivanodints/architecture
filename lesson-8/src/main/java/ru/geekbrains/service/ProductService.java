package ru.geekbrains.service;


import org.springframework.data.domain.Page;
import ru.geekbrains.art_shop.BasketProduct;

import java.util.List;
import java.util.Optional;

public interface ProductService {

     List<ProductRepr> showAllProducts();



     Optional<ProductRepr> findProductById (Long id);


     void saveProduct (ProductRepr productRepr);


     void deleteProductById (Long id);
     void deleteRestProductById (Long id);


     Page<ProductRepr> findWithFilter(String productTitleFilter,
                                      Integer minPriceFiler,
                                      Integer maxPriceFilter,
                                      Integer pageNumber,
                                      Integer tableSize,
                                      String sort);


     List<BasketProduct> showBasket();

     BasketProduct addProductToBasketById(Long id);

     void deleteBasketProductById(Long id);

     Optional<BasketProduct> findProductInBasketById (Long id);



}
