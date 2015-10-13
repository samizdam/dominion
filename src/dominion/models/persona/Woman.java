package dominion.models.persona;

import dominion.models.Date;

public class Woman extends AbstractPersona {

    Woman(Man father, Woman mother, Date dateOfBirth) {
	super(father, mother, dateOfBirth);
	this.gender = Gender.female;
    }
}
