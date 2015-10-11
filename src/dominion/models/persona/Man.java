package dominion.models.persona;

public class Man extends AbstractPersona {

    public Man(Man father, Woman mother) {
	super(father, mother);
	this.gender = Gender.male;
    }
}
