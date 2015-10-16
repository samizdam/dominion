package dominion.base.persona;

import dominion.models.Date;
import dominion.models.persona.Gender;
import dominion.models.persona.Woman;

public class BaseWoman extends AbstractPersona implements Woman{

    BaseWoman(Man father, BaseWoman mother, Date dateOfBirth) {
	super(father, mother, dateOfBirth);
	this.gender = Gender.female;
    }
}
