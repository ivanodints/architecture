package ru.geekbrains.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import ru.geekbrains.art_shop.ArtShopRepo;
import ru.geekbrains.art_shop.Product;


@Controller
@RequestMapping("/artshop")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ru.geekbrains.controller.ProductController.class);

    private ArtShopRepo artShopRepo;

    @Autowired
    public ProductController(ArtShopRepo artShopRepo) {
        this.artShopRepo = artShopRepo;
    }

    @GetMapping
    public String indexPage (Model model) {
        logger.info("List page requested");

        model.addAttribute("product",artShopRepo.showAllProducts());
        return "artShop";
    }

    @GetMapping("/{id}")
    public String editPage(@PathVariable("id") Long id, Model model) {
        logger.info("Edit page for product id {} requested", id);

        model.addAttribute("product", artShopRepo.findProductById(id));
        return "product_form";
    }

    @GetMapping("/createProduct")
    public String addProduct(Model model){
        logger.info("Create new Product");

        model.addAttribute("product", new Product());
        return "product_form";
    }


    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        logger.info("Delete product with id = {}", id);

        artShopRepo.deleteProductById(id);
        return "redirect:/artshop";
    }


    @PostMapping("/update")
    public String updateProduct(@Valid Product product, BindingResult result) {
        logger.info("Update endpoint requested");

        if (result.hasErrors()) {
            return "product_form";
        }

        if (artShopRepo.getProductMap().containsKey(product.getId())) {
            logger.info("Product update");

            artShopRepo.updateProduct(product);
        } else {
            logger.info("Create new Product");

            artShopRepo.insertProduct(product);
        }
        return "redirect:/artshop";
    }

}
