package dominion.base.persona.name;

import dominion.models.persona.name.FamilyName;
import dominion.models.persona.name.PersonaFullName;

/**
 * TODO make implementation not a public. Think about culture dependencies. 
 * @author samizdam
 *
 */
public class BasePersonaName implements PersonaFullName {

    private BaseFirstName firstName;
    private FamilyName familyName;

    public BasePersonaName(String firstName, String familyName) {
	this.firstName = new BaseFirstName(firstName);
	this.familyName = new BaseFamilyName(familyName);
    }

    public BaseFirstName getFirstName() {
	return this.firstName;
    }

    @Override
    public FamilyName getFamilyName() {
	return this.familyName;
    }

}
