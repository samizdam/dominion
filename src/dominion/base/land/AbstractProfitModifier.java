package dominion.base.land;

import java.util.HashMap;

import dominion.models.characteristic.Characteristic;
import dominion.models.characteristic.CharacteristicValue;
import dominion.models.land.LandModifier;

abstract class AbstractProfitModifier extends HashMap<Characteristic, CharacteristicValue> implements LandModifier{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
}