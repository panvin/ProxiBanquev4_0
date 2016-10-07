package com.sbev.proxibanque.domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("GERANT")
public class Gerant extends Conseiller {

}
