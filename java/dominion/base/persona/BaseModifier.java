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
    private String name;
    
    public BaseModifier(String name) {
	this.name = name;
    }

    @Override
    public String getName() {
	return this.name;
    }


}
