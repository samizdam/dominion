package dominion.models.persona;

import dominion.base.persona.Man;

public interface CharacteristicGenerator {

    PersonaCharacteristicMap generateCollection(Man man);

}
