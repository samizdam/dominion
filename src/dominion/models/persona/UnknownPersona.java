package dominion.models.persona;

import dominion.base.persona.LogicException;
import dominion.models.persona.name.PersonaFullName;

public interface UnknownPersona extends Persona{
    
    public void setName(PersonaFullName name) throws LogicException;

}