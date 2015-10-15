package dominion.base.persona;

import dominion.base.persona.name.UnknownPersonaName;
import dominion.models.persona.Persona;
import dominion.models.persona.name.PersonaName;

public class UnknownPersona implements Persona{

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
