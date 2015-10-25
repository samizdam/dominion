package dominion.base.land.modifier;

import java.util.HashMap;

import dominion.models.characteristic.Characteristic;
import dominion.models.characteristic.CharacteristicValue;
import dominion.models.land.modifier.LandModifier;

abstract class AbstractLandModifier extends HashMap<Characteristic, CharacteristicValue> implements LandModifier{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
}