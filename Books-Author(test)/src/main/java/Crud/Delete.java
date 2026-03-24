package Crud;

import javax.persistence.*;

import Entity.Author;

public class Delete {

    public static void main(String[] args) {

    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Author author = em.find(Author.class, 2);

        et.begin();
        em.remove(author);  
        et.commit();

        System.out.println("deleted");
    }
}

