package brianpelinku.entities;

import brianpelinku.enums.Genere;
import brianpelinku.enums.TipoEvento;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "concerti")
public class Concerto extends Evento {
    @Enumerated(EnumType.STRING)
    @Column(name = "genere")
    private Genere genere;
    @Column(name = "in_streaming")
    private boolean inStreaming;

    // costruttori
    public Concerto(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassinoParteciapnti, Genere genere, boolean inStreaming) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassinoParteciapnti);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    public Concerto() {
    }

    // getter e setter
    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }

    // toString


    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", inStreaming=" + inStreaming +
                '}';
    }
}
