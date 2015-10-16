package dominion.base.persona;

import dominion.models.Date;
import dominion.models.persona.Gender;
import dominion.models.persona.Man;
import dominion.models.persona.Woman;

class BaseWoman extends AbstractPersona implements Woman{

    BaseWoman(Man father, Woman mother, Date dateOfBirth) {
	super(father, mother, dateOfBirth);
	this.gender = Gender.female;
    }
}
