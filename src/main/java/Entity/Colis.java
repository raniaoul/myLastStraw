package Entity;

import jakarta.persistence.*;

import javax.sound.midi.Receiver;
import java.util.Date;

@Entity
public class Colis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="numeroColis")
    private Long numero;
    private Date dateDepot;
    private Date dateReception;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Facteur facteur;


    @ManyToOne
    @JoinColumn(name = "emmeteur", referencedColumnName = "id")
    private Habitant emmeteur;

    @ManyToOne
    @JoinColumn(name = "receveur", referencedColumnName = "id")
    private Habitant receveur;


    public Colis(Long numero, Date dateDepot, Date dateReception) {
        this.numero = numero;
        this.dateDepot = dateDepot;
        this.dateReception = dateReception;
    }

    public Colis() {
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Date getDateDepot() {
        return dateDepot;
    }

    public void setDateDepot(Date dateDepot) {
        this.dateDepot = dateDepot;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    @Override
    public String toString() {
        return "Colis{" +
                "numero=" + numero +
                ", dateDepot=" + dateDepot +
                ", dateReception=" + dateReception +
                '}';
    }
}
