package brianpelinku.entities;

import brianpelinku.enums.TipoEvento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "partite_di_calcio")
public class PartitaDiCalcio extends Evento {
    @Column(name = "squadra_di_casa")
    private String squadraDiCasa;
    @Column(name = "squadra_ospite")
    private String squadraOspite;
    @Column(name = "squadra_vincente")
    private String squadraVincente;
    @Column(name = "num_gol_squadra_casa")
    private int numGolSquadraCasa;
    @Column(name = "num_gol_squadra_ospite")
    private int numGolSquadraOspite;

    // costruttori
    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassinoParteciapnti, String squadraDiCasa, String squadraOspite, String squadraVincente, int numGolSquadraCasa, int numGolSquadraOspite) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassinoParteciapnti);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.numGolSquadraCasa = numGolSquadraCasa;
        this.numGolSquadraOspite = numGolSquadraOspite;
    }

    public PartitaDiCalcio() {
    }

    // getter e setter

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getNumGolSquadraCasa() {
        return numGolSquadraCasa;
    }

    public void setNumGolSquadraCasa(int numGolSquadraCasa) {
        this.numGolSquadraCasa = numGolSquadraCasa;
    }

    public int getNumGolSquadraOspite() {
        return numGolSquadraOspite;
    }

    public void setNumGolSquadraOspite(int numGolSquadraOspite) {
        this.numGolSquadraOspite = numGolSquadraOspite;
    }

    // toString
    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", numGolSquadraCasa=" + numGolSquadraCasa +
                ", numGolSquadraOspite=" + numGolSquadraOspite +
                '}';
    }
}
