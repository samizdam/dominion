package dominion.models.culture;

import dominion.models.persona.name.PersonaNameGenerator;

public interface Culture {
    public PersonaNameGenerator getPersonaNameGenerator();
}
