package dominion.models.plugin;

import dominion.models.culture.Culture;
import dominion.models.persona.PersonaFactory;
import dominion.models.persona.PersonaService;

public interface PersonaPlugin extends Plugin {

    public PersonaFactory getPersonaFactory(Culture culture);

    public PersonaService getPersonaService();
}
