package dominion.models.persona.name;

import dominion.models.Generator;
import dominion.models.persona.WellBornPersona;

public interface PersonaNameGenerator extends Generator{
    public PersonaFullName generateName(WellBornPersona persona);
}
