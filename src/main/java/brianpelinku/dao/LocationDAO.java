package brianpelinku.dao;

import brianpelinku.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class LocationDAO {
    EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }

    // save
    public void save(Location location) {
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.persist(location);
            transaction.commit();
            System.out.println("Location " + location.getNome() + " a " + location.getCitta() + " salvato!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // get by id
    public Location findById(UUID id) {
        return em.find(Location.class, id);
    }

    // delete
    public void delete(UUID id) {
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            Location found = em.find(Location.class, id);
            if (found != null) {
                em.remove(found);
                transaction.commit();
                System.out.println("Location eliminata!");
            } else {
                System.out.println("Location non trovata!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
