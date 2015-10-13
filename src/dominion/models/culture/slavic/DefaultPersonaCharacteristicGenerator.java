package dominion.models.culture.slavic;

import dominion.models.persona.CharacteristicGenerator;
import dominion.models.persona.Man;
import dominion.models.persona.PersonaCharacteristicMap;

public class DefaultPersonaCharacteristicGenerator implements CharacteristicGenerator {

    @Override
    public PersonaCharacteristicMap generateCollection(Man man) {
	return new DefaultPersonaCharacteristicMap();
    }

}
