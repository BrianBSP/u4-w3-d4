package brianpelinku.entities;


import brianpelinku.enums.TipoEvento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "gare_atletica")
public class GaraDiAtletica extends Evento {
    @OneToMany(mappedBy = "gara")
    @Column(name = "set_atleti")
    private List<Persona> setAtleti;

    /*@Column(name = "vincitore")
    private Persona vincitore;*/

    // costruttori

    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassinoParteciapnti, List<Persona> setAtleti) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassinoParteciapnti);
        this.setAtleti = setAtleti;
        //this.vincitore = vincitore;
    }

    public GaraDiAtletica() {
    }

    // getter e setter
    public List<Persona> getSetAtleti() {
        return setAtleti;
    }

    public void setSetAtleti(List<Persona> setAtleti) {
        this.setAtleti = setAtleti;
    }

    /*public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }*/

    // toSting
    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "setAtleti=" + setAtleti +
                //", vincitore=" + vincitore +
                '}';
    }
}
