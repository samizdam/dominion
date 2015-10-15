package dominion.models.land;

import java.util.HashMap;

import dominion.models.characteristic.Characteristic;
import dominion.models.characteristic.CharacteristicValue;

abstract class AbstractProfitModifier extends HashMap<Characteristic, CharacteristicValue> implements LandModifier{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
}