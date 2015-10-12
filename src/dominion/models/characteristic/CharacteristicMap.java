package dominion.models.characteristic;

import java.util.Map;

import dominion.models.CharacteristicValue;

public interface CharacteristicMap extends Map<Characteristic, CharacteristicValue> {

    CharacteristicValue get(Characteristic character);

}
