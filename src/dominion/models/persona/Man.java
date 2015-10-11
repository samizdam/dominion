package dominion.models.persona;

import dominion.models.persona.name.Woman;

public class Man extends AbstractPersona {

    public Man(Man father, Woman mother) {
	super(father, mother);
	this.gender = Gender.male;
    }
}
