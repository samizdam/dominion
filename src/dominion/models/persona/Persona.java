package dominion.models.persona;

import dominion.models.Entity;
import dominion.models.persona.name.PersonaName;

/**
 * 
 * @author samizdam
 *
 */
public interface Persona extends Entity{
    
    
    public PersonaName getName();
    
    public void setName(PersonaName name);
    
}
