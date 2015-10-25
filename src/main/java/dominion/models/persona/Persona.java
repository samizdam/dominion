package dominion.models.persona;

import dominion.models.Entity;
import dominion.models.persona.name.PersonaFullName;

/**
 * 
 * @author samizdam
 *
 */
public interface Persona extends Entity{
    
    
    public PersonaFullName getName();
        
    public State getState();
    
}
