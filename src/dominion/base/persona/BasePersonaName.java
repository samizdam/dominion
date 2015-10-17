package dominion.base.persona;

import dominion.base.persona.name.FamilyName;
import dominion.base.persona.name.FirstName;
import dominion.models.persona.name.PersonaName;

public class BasePersonaName implements PersonaName {

    private FirstName firstName;
    private FamilyName familyName;

    public BasePersonaName(String firstName, String familyName) {
	this.firstName = new FirstName(firstName);
	this.familyName = new FamilyName(familyName);
    }

    public FirstName getFirstName() {
	return this.firstName;
    }

    @Override
    public FamilyName getFamilyName() {
	return this.familyName;
    }

}
