package dominion.base.persona;

import java.util.HashMap;

import dominion.models.characteristic.Characteristic;
import dominion.models.characteristic.CharacteristicValue;
import dominion.models.persona.PersonaModifier;

class BaseModifier extends HashMap<Characteristic, CharacteristicValue> implements PersonaModifier {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public CharacteristicValue get(Characteristic character) {
	return super.get(character);
    }


}
