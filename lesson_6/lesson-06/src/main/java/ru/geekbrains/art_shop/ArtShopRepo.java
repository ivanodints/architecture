package ru.geekbrains.art_shop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class ArtShopRepo {

    private static ProductIdentityMap productIdentityMap;

    private final EntityManagerFactory entityManagerFactory;

    public ArtShopRepo(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public void initRepoWithDefaultData() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Product product1 = new Product("paints","old rust", 35);
        Product product2 = new Product("brushes","Kolinsky 1.0", 4);
        Product product3 = new Product("paints","bloody red", 27);
        Product product4 = new Product("paints","brass", 31);
        Product product5 = new Product("pencils","HB black", 2);
        entityManager.persist(product1);
        entityManager.persist(product1);
        entityManager.persist(product2);
        entityManager.persist(product3);
        entityManager.persist(product4);
        entityManager.persist(product5);

        entityManager.getTransaction().commit();
        entityManager.close();

    }


    public Product findProductById (long id) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Product product = new Product();

        if(productIdentityMap.getProduct(1L) == null){
            product = entityManager.find(Product.class, 1L);
            productIdentityMap.addProduct(product);
        } else {
            product = productIdentityMap.getProduct(1L);
        }
        entityManager.close();

        return product;


    }

}