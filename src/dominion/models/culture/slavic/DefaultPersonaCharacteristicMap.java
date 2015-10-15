package dominion.models.culture.slavic;

import java.util.HashMap;

import dominion.base.characteristic.LimitedCharacteristicValue;
import dominion.models.characteristic.Characteristic;
import dominion.models.characteristic.CharacteristicValue;
import dominion.models.persona.PersonaCharacteristicMap;

public class DefaultPersonaCharacteristicMap extends HashMap<Characteristic, CharacteristicValue>
	implements PersonaCharacteristicMap {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;


    @Override
    public CharacteristicValue get(Characteristic character) {
	if(this.containsKey(character) ){
	    return super.get(character);
	} else {
	    CharacteristicValue newCharValue = new LimitedCharacteristicValue(character);
	    super.put(character, newCharValue);
	    return newCharValue;
	}
    }

}
