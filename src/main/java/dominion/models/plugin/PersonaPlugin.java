package dominion.models.plugin;

import dominion.models.persona.PersonaService;

public interface PersonaPlugin extends Plugin {

    public PersonaService getPersonaService();
}
