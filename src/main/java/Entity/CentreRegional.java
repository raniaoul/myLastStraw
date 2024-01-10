package Entity;

import Entity.Super.CentrePostal;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;
@Entity

public class CentreRegional extends CentrePostal {

    @OneToMany(mappedBy = "regional")
    List<CentrePostal> centres = new ArrayList<>();

    public CentreRegional(int numero, String nom, String rue, String quartier, String ville, List<CentrePostal> centres) {
        super(numero, nom, rue, quartier, ville);
        this.centres = centres;
    }

    public CentreRegional() {
    }

}
