package dominion.models.persona;

import dominion.models.persona.name.PersonaName;
import dominion.models.persona.name.UnknownPersonaName;

public class UnknowPersona implements Persona{

    private PersonaName name = new UnknownPersonaName();
    
    @Override
    public PersonaName getName() {
	return this.name;
    }

    @Override
    public void setName(PersonaName name) {
	this.name = name;
	
    }

}
