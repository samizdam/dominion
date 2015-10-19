package dominion.base.persona;

import dominion.base.persona.name.UnknownPersonaName;
import dominion.models.persona.Persona;
import dominion.models.persona.UnknownPersona;
import dominion.models.persona.name.PersonaName;

/**
 * TODO make not a public. Think about providing factory to other plugin packages.  
 * @author samizdam
 *
 */
public class BaseUnknownPersona implements Persona, UnknownPersona{

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
