package Entity.Super;

import Entity.*;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class CentrePostal {
    @Id
    private int numeroPostal;
    private String nom;
    private String rue;
    private String quartier;
    private String ville;

    @ManyToOne
    @JoinColumn(name = "regional_id")
    private CentreRegional regional;

    @OneToMany(mappedBy = "centrePostalFacteur")
    private List<Facteur> listeFacteurs = new ArrayList<>();

    @OneToMany(mappedBy = "centrePostalHabitant")
    private List<Habitant> listeHabitants = new ArrayList<>();

    public CentrePostal(int numeroPostal, String nom, String rue, String quartier, String ville) {
        this.numeroPostal = numeroPostal;
        this.nom = nom;
        this.rue = rue;
        this.quartier = quartier;
        this.ville = ville;
    }

    public CentrePostal() {
    }

    public int getNumeroPostal() {
        return numeroPostal;
    }

    public void setNumeroPostal(int numero) {
        this.numeroPostal = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public CentreRegional getRegional() {
        return regional;
    }

    public void setRegional(CentreRegional regional) {
        this.regional = regional;
    }

    public List<Facteur> getListeFacteurs() {
        return listeFacteurs;
    }

    public void setListeFacteurs(List<Facteur> listeFacteurs) {
        this.listeFacteurs = listeFacteurs;
    }

    public List<Habitant> getListeHabitants() {
        return listeHabitants;
    }

    public void setListeHabitants(List<Habitant> listeHabitants) {
        this.listeHabitants = listeHabitants;
    }

    @Override
    public String toString() {
        return "CentrePostal{" +
                "numero=" + numeroPostal +
                ", nom='" + nom + '\'' +
                ", rue='" + rue + '\'' +
                ", quartier='" + quartier + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
