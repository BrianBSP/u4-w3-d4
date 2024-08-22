package brianpelinku.dao;

import brianpelinku.entities.Partecipazione;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class PartecipazioneDAO {
    EntityManager em;

    public PartecipazioneDAO(EntityManager em) {
        this.em = em;
    }

    // save
    public void save(Partecipazione partecipazione) {
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.persist(partecipazione);
            transaction.commit();
            System.out.println("Partecipazione creata! \n" + partecipazione.getPersona().getNome() + " " + partecipazione.getPersona().getCognome() + " --> " + partecipazione.getEvento());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // find by id
    public Partecipazione findById(UUID id) {
        return em.find(Partecipazione.class, id);
    }

    // delete
    public void delete(UUID id) {
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            Partecipazione found = em.find(Partecipazione.class, id);
            if (found != null) {
                em.remove(found);
                transaction.commit();
                System.out.println("Partecipazione eliminata!");
            } else {
                System.out.println("Partecipazione non trovata");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
