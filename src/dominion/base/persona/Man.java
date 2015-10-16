package dominion.base.persona;

import dominion.models.Date;
import dominion.models.persona.Gender;

public class Man extends AbstractPersona {

    Man(Man father, BaseWoman mother, Date dateOfBirth) {
	super(father, mother, dateOfBirth);
	this.gender = Gender.male;
    }


}
