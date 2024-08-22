package brianpelinku;

import brianpelinku.dao.EventoDAO;
import brianpelinku.dao.LocationDAO;
import brianpelinku.dao.PartecipazioneDAO;
import brianpelinku.dao.PersonaDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4_w3_d4");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        EventoDAO ed = new EventoDAO(em);
        LocationDAO ld = new LocationDAO(em);
        PartecipazioneDAO ptd = new PartecipazioneDAO(em);
        PersonaDAO pd = new PersonaDAO(em);


        System.out.println("Hello World!");
    }
}
