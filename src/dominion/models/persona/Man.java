package dominion.models.persona;

public class Man extends AbstractPersona {

    Man(Man father, Woman mother) {
	super(father, mother);
	this.gender = Gender.male;
    }


}
