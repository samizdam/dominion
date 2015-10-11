package dominion.models.culture;

import dominion.models.persona.name.PersonaNameGenerationStrategy;

public interface Culture {
    public PersonaNameGenerationStrategy getPersonaNameGenerationStrategy();
}
