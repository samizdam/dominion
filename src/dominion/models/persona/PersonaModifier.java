package dominion.models.persona;

import java.util.Map;

import dominion.models.characteristic.Characteristic;
import dominion.models.characteristic.CharacteristicValue;
import dominion.models.characteristic.Modifier;

public interface PersonaModifier extends Modifier, Map<Characteristic, CharacteristicValue>{

    String getName();
}
