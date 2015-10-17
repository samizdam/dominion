package dominion.models.plugin;

import dominion.models.culture.Culture;
import dominion.models.persona.PersonaFactory;

public interface PersonaPlugin {
    public PersonaFactory getPersonaFactory(Culture culture);
    
}
