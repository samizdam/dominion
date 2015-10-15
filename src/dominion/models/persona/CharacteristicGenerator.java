package dominion.models.persona;

import dominion.base.persona.Man;
import dominion.base.persona.PersonaCharacteristicMap;

public interface CharacteristicGenerator {

    PersonaCharacteristicMap generateCollection(Man man);

}
