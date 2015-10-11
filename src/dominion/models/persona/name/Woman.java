package dominion.models.persona.name;

import dominion.models.persona.AbstractPersona;
import dominion.models.persona.Gender;
import dominion.models.persona.Man;

public class Woman extends AbstractPersona {

    public Woman(Man father, Woman mother) {
	super(father, mother);
	this.gender = Gender.female;
    }
}
