package dominion.models.persona;

import dominion.models.Date;

public class Man extends AbstractPersona {

    Man(Man father, Woman mother, Date dateOfBirth) {
	super(father, mother, dateOfBirth);
	this.gender = Gender.male;
    }


}
