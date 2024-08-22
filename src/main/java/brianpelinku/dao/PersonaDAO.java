package brianpelinku.dao;

import brianpelinku.entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class PersonaDAO {
    private EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }

    // save
    public void save(Persona persona) {
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.persist(persona);
            transaction.commit();
            System.out.println("Utente: " + persona.getNome() + " " + persona.getCognome() + " creato!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // get by id
    public Persona getById(UUID id) {
        return em.find(Persona.class, id);
    }

    // delete
    public void delete(UUID id) {
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            Persona found = em.find(Persona.class, id);
            if (found != null) {
                em.remove(found);
                transaction.commit();
                System.out.println("Utente eliminato correttamente!");
            } else {
                System.out.println("Utente non trovato!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
