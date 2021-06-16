package ru.geekbrains;

import org.hibernate.cfg.Configuration;
import org.w3c.dom.ls.LSOutput;
import ru.geekbrains.art_shop.ArtShopRepo;
import ru.geekbrains.art_shop.Product;
import ru.geekbrains.art_shop.ProductIdentityMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        startHomeWorkApp();
        System.out.println("второй проход");
        startHomeWorkApp();

    }



    public static void startHomeWorkApp() {

        EntityManagerFactory entityManagerFactory = new Configuration()
                .configure("hibernate.cfg.xml").buildSessionFactory();

        ArtShopRepo artShopRepo = new ArtShopRepo(entityManagerFactory);

        if (artShopRepo == null){
            artShopRepo.initRepoWithDefaultData();
        }

        System.out.println("\n++ Find Product by ID = 3 ++");
        System.out.println(artShopRepo.findProductById(3L));


    }

}
