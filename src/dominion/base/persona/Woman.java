package dominion.base.persona;

import dominion.models.Date;
import dominion.models.persona.Gender;

public class Woman extends AbstractPersona {

    Woman(Man father, Woman mother, Date dateOfBirth) {
	super(father, mother, dateOfBirth);
	this.gender = Gender.female;
    }
}
