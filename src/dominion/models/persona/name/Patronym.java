package dominion.models.persona.name;

public class Patronym extends AbstractAnthroponym{

    public Patronym(FirstName fatherName) {
	super(fatherName.toString() + "ович");
    }

}
