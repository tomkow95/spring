package main;

import domain.Bank;
import domain.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.factory");

        Client client = new Client(2, "Tomek");
        Bank bank = new Bank("ING Bank");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.persist(client);
        entityManager.persist(bank);
        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
