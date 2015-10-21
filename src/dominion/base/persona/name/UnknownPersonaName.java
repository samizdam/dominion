package dominion.base.persona.name;

import dominion.models.persona.name.FamilyName;
import dominion.models.persona.name.PersonaFullName;

public class UnknownPersonaName implements PersonaFullName {

    private BaseFirstName firstName = new BaseFirstName("unknown");
    private FamilyName familyName = new BaseFamilyName("unknown");
    
    @Override
    public BaseFirstName getFirstName() {
	return this.firstName;
    }

    @Override
    public FamilyName getFamilyName() {
	return this.familyName ;
    }


}
