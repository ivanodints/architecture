package ru.geekbrains.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.art_shop.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {


    private final ProductRepo productRepo;
    private final BasketRepo basketRepo;


    @Autowired
    public ProductServiceImpl(ProductRepo productRepo, BasketRepo basketRepo) {
        this.productRepo = productRepo;
        this.basketRepo = basketRepo;
    }

    @Override
    public List<ProductRepr> showAllProducts() {

        return productRepo.findAll().stream().map(ProductRepr::new).collect(Collectors.toList());

    }

    @Transactional
    @Override
    public Optional<ProductRepr> findProductById(Long id) {

        return productRepo.findById(id).map(ProductRepr::new);
    }

    @Transactional
    @Override
    public void saveProduct(ProductRepr productRepr) {
        productRepo.save(new Product(productRepr));
    }


    @Transactional
    @Override
    public void deleteProductById(Long id) {
        productRepo.deleteById(id);
    }


    @Override
    public Page<ProductRepr> findWithFilter(String productTitleFilter,
                                            Integer minPriceFilter,
                                            Integer maxPriceFilter,
                                            Integer pageNumber,
                                            Integer tableSize,
                                            String sort) {

        Specification<Product> spec = Specification.where(null);

        if (productTitleFilter != null && !productTitleFilter.isBlank()) {
            spec = spec.and(ProductSpecification.titleLike(productTitleFilter));
        }
        if (minPriceFilter != null) {
            spec = spec.and(ProductSpecification.minPrice(minPriceFilter));
        }
        if (maxPriceFilter != null) {
            spec = spec.and(ProductSpecification.maxPrice(maxPriceFilter));
        }
        if (sort == null) {
            return productRepo.findAll(spec, PageRequest.of(pageNumber, tableSize))
                    .map(ProductRepr::new);

        } else if (sort.isEmpty()){
            return productRepo.findAll(spec, PageRequest.of(pageNumber, tableSize))
                    .map(ProductRepr::new);
        } else {
            return productRepo.findAll(spec, PageRequest.of(pageNumber, tableSize, Sort.by(sort).ascending()))
                    .map(ProductRepr::new);
        }
    }



    @Override
    public void deleteRestProductById(Long id) {
        productRepo.deleteById(id);
    }


    @Override
    public List<BasketProduct> showBasket() {

        return basketRepo.findAll().stream().map(BasketProduct::new).collect(Collectors.toList());

    }

    @Transactional
    @Override
    public BasketProduct addProductToBasketById(Long id) {


        Product product = productRepo.findById(id).get();

        BasketProduct basketProduct = basketRepo.save(new BasketProduct(product));
        return basketProduct;

    }

    @Override
    public void deleteBasketProductById(Long id) {
        basketRepo.deleteById(id);
    }

    @Override
    public Optional<BasketProduct> findProductInBasketById(Long id) {
        return basketRepo.findById(id).map(BasketProduct::new);
    }



}

