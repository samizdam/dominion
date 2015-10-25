package dominion.base.culture;

import dominion.base.persona.name.BasePersonaName;
import dominion.models.persona.WellBornPersona;
import dominion.models.persona.name.PersonaFullName;
import dominion.models.persona.name.PersonaNameGenerator;

public class BasePersonaNameGenerator implements PersonaNameGenerator {

    @Override
    public PersonaFullName generateName(WellBornPersona persona) {
	String firstName = null, familyName = null;
	switch (persona.getGender()) {
	case male:
	    firstName = "Roland";
	    familyName = "Garros";
	    break;
	    
	case female:
	    firstName = "Anna";
	    familyName = "Garros";
	    break;
	}
	
	return new BasePersonaName(firstName, familyName);
    }

}
