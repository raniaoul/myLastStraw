package Entity;

import Entity.Super.CentrePostal;
import Entity.Super.Personne;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Facteur extends Personne {

    @OneToMany(mappedBy = "facteur")

    private List<Colis> listeColis = new ArrayList<>();

    @ManyToOne
    @JoinColumn(referencedColumnName = "numeroPostal")
    private CentrePostal centrePostalFacteur;


    public Facteur(String nom, String prenom, String rue, String quartier, String ville) {
        super(nom, prenom, rue, quartier, ville);
    }

    public Facteur() {
    }

    public List<Colis> getListeColis() {
        return listeColis;
    }

    public void setListeColis(List<Colis> listeColis) {
        this.listeColis = listeColis;
    }

    public CentrePostal getCentrePostalFacteur() {
        return centrePostalFacteur;
    }

    public void setCentrePostalFacteur(CentrePostal centrePostalFacteur) {
        this.centrePostalFacteur = centrePostalFacteur;
    }
}
