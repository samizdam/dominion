package dominion.models;

import java.util.Map;

public interface CharacteristicMap extends Map<Characteristic, CharacteristicValue> {

    CharacteristicValue get(Characteristic character);

}
