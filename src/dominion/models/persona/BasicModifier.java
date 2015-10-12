package dominion.models.persona;

import java.util.HashMap;

import dominion.models.CharacteristicValue;
import dominion.models.characteristic.Characteristic;

public class BasicModifier extends HashMap<Characteristic, CharacteristicValue> implements PersonaModifier {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public CharacteristicValue get(Characteristic character) {
	return super.get(character);
    }


}
