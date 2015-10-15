package dominion.models.culture.slavic;

import dominion.base.persona.Man;
import dominion.base.persona.PersonaCharacteristicMap;
import dominion.models.persona.CharacteristicGenerator;

public class DefaultPersonaCharacteristicGenerator implements CharacteristicGenerator {

    @Override
    public PersonaCharacteristicMap generateCollection(Man man) {
	return new DefaultPersonaCharacteristicMap();
    }

}
