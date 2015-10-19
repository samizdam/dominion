package dominion.models.culture;

import dominion.models.Entity;
import dominion.models.land.DemosGenerator;
import dominion.models.land.LandNameGenerator;
import dominion.models.persona.CharacteristicGenerator;
import dominion.models.persona.name.PersonaNameGenerator;

public interface Culture extends Entity{
    public PersonaNameGenerator getPersonaNameGenerator();

    public CharacteristicGenerator getPersonaCharacteristicGenerator();

    public LandNameGenerator getLandNameGenerator();

    public DemosGenerator getDemosGenerator();
}
