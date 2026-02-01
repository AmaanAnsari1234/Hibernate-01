package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Product;
import entity.Review;

public class Fetch {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();

        Product product = em.find(Product.class, 11);

        if (product != null) {
            System.out.println("Product: " + product.getName());

            for (Review r : product.getReviews()) {
                System.out.println("Review: " + r.getMsg());
            }
        } else {
            System.out.println("Product not found");
        }

        em.close();
        emf.close();
    }
}
