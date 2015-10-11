package dominion.models.persona;

public class Woman extends AbstractPersona {

    public Woman(Man father, Woman mother) {
	super(father, mother);
	this.gender = Gender.female;
    }
}
