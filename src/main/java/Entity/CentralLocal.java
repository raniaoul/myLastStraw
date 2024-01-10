package Entity;

import Entity.Super.CentrePostal;
import jakarta.persistence.Entity;

@Entity
public class CentralLocal extends CentrePostal {
    public CentralLocal(int numero, String nom, String rue, String quartier, String ville) {
        super(numero, nom, rue, quartier, ville);
    }

    public CentralLocal() {
    }
}
