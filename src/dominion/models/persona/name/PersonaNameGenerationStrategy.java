package dominion.models.persona.name;

import dominion.models.persona.Persona;

public interface PersonaNameGenerationStrategy {
    public PersonaName generateName(Persona persona);
}
