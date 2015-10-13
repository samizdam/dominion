package dominion.models.persona.name;

import dominion.models.persona.WellBornPersona;

public interface PersonaNameGenerator {
    public PersonaName generateName(WellBornPersona persona);
}
