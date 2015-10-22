package dominion.base.persona;

import dominion.base.persona.name.UnknownPersonaName;
import dominion.base.persona.state.DeadState;
import dominion.models.persona.Persona;
import dominion.models.persona.State;
import dominion.models.persona.UnknownPersona;
import dominion.models.persona.name.PersonaFullName;

/**
 * TODO make not a public. Think about providing factory to other plugin packages.  
 * @author samizdam
 *
 */
public class BaseUnknownPersona implements Persona, UnknownPersona{

    private PersonaFullName name = new UnknownPersonaName();
    private State state = new DeadState();
    
    @Override
    public PersonaFullName getName() {
	return this.name;
    }
    

    @Override
    public void setName(PersonaFullName name) throws LogicException {
	throw new LogicException();
	
    }


    @Override
    public State getState() {
	return this.state;
    }

}
