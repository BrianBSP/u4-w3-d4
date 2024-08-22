package brianpelinku.dao;

import brianpelinku.entities.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class EventoDAO {
    private EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    // save
    public void save(Evento evento) {
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.persist(evento);
            transaction.commit();
            System.out.println("Evento " + evento.getTitolo() + " creato!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // get by id
    public Evento getById(UUID id) {
        return em.find(Evento.class, id);
    }

    // delete
    public void delete(UUID id) {
        try {
            EntityTransaction transaction = em.getTransaction();
            Evento found = em.find(Evento.class, id);
            if (found != null) {
                transaction.begin();
                em.remove(found);
                transaction.commit();
                System.out.println("Elemento eliminato");
            } else System.out.println("Elemento non trovato");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
