package dominion.models.plugin;

import dominion.models.culture.Culture;
import dominion.models.persona.PersonaFactory;

public interface PersonaPlugin extends Plugin {
    public PersonaFactory getPersonaFactory(Culture culture);
    
}
