package dominion.base.persona;

import dominion.models.Date;
import dominion.models.persona.Gender;
import dominion.models.persona.Man;
import dominion.models.persona.Woman;

public class BaseMan extends AbstractPersona implements Man {

    BaseMan(Man father, Woman mother, Date dateOfBirth) {
	super(father, mother, dateOfBirth);
	this.gender = Gender.male;
    }


}
