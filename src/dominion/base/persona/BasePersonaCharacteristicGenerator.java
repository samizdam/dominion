package dominion.base.persona;

import dominion.models.persona.CharacteristicGenerator;
import dominion.models.persona.Man;
import dominion.models.persona.PersonaCharacteristicMap;

/**
 * TODO set package visibility. Think about Plugin-level Factory and Registry for this type.  
 * @author samizdam
 *
 */
public class BasePersonaCharacteristicGenerator implements CharacteristicGenerator {

    @Override
    public PersonaCharacteristicMap generateCollection(Man man) {
	return new BasePersonaCharacteristicMap();
    }

}
