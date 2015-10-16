package dominion.base.persona;

import dominion.models.persona.CharacteristicGenerator;
import dominion.models.persona.Man;
import dominion.models.persona.PersonaCharacteristicMap;

public class BasePersonaCharacteristicGenerator implements CharacteristicGenerator {

    @Override
    public PersonaCharacteristicMap generateCollection(Man man) {
	return new BasePersonaCharacteristicMap();
    }

}
