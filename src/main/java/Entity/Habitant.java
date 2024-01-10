package Entity;

import Entity.Super.CentrePostal;
import Entity.Super.Personne;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Habitant extends Personne {
    private String email;
    private String telephone;

    @ManyToOne
    @JoinColumn(referencedColumnName = "numeroPostal")
    private CentrePostal centrePostalHabitant;
    @OneToMany(mappedBy = "receveur")
    private List<Colis> colisReceveur= new ArrayList<>();
    @OneToMany(mappedBy = "emmeteur")
    private List<Colis> colisEmmeteur = new ArrayList<>();
    public Habitant(String nom, String prenom, String rue, String quartier, String ville, String email, String telephone) {
        super(nom, prenom, rue, quartier, ville);
        this.email = email;
        this.telephone = telephone;
    }

    public Habitant() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public CentrePostal getCentrePostalHabitant() {
        return centrePostalHabitant;
    }

    public void setCentrePostalHabitant(CentrePostal centrePostalHabitant) {
        this.centrePostalHabitant = centrePostalHabitant;
    }

    public List<Colis> getColisReceveur() {
        return colisReceveur;
    }

    public void setColisReceveur(List<Colis> colisReceveur) {
        this.colisReceveur = colisReceveur;
    }

    public List<Colis> getColisEmmeteur() {
        return colisEmmeteur;
    }

    public void setColisEmmeteur(List<Colis> colisEmmeteur) {
        this.colisEmmeteur = colisEmmeteur;
    }
}
