package dominion.models.persona;

import dominion.base.persona.LogicException;
import dominion.models.persona.name.PersonaFullName;

public interface UnknownPersona {

    public PersonaFullName getName();
    
    public void setName(PersonaFullName name) throws LogicException;

}