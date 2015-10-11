package dominion.models.culture.slavic;

import dominion.models.persona.CharacteristicGenerator;
import dominion.models.persona.Man;
import dominion.models.persona.PersonaCharacteristic;
import dominion.models.persona.PersonaCharacteristicCollection;

public class DefaultPersonaCharacteristicGenerator implements CharacteristicGenerator {

    @Override
    public PersonaCharacteristicCollection<PersonaCharacteristic> generateCollection(Man man) {
	return new DefaultPersonaCharacteristicCollection<PersonaCharacteristic>();
    }

}
