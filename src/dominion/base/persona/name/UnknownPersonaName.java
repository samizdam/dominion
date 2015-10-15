package dominion.base.persona.name;

import dominion.models.persona.name.PersonaName;

public class UnknownPersonaName implements PersonaName {

    private FirstName firstName = new FirstName("unknown");
    private FamilyName familyName = new FamilyName("unknown");
    
    @Override
    public FirstName getFirstName() {
	return this.firstName;
    }

    @Override
    public FamilyName getFamilyName() {
	return this.familyName ;
    }


}
