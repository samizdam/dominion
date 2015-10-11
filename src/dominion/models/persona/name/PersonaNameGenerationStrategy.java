package dominion.models.persona.name;

import dominion.models.persona.WellBornPersona;

public interface PersonaNameGenerationStrategy {
    public PersonaName generateName(WellBornPersona persona);
}
