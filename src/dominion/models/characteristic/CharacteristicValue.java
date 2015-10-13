package dominion.models.characteristic;

import dominion.models.ValueObject;

public interface CharacteristicValue extends ValueObject{

    int toInt();

    CharacteristicValue merge(CharacteristicValue value);

}
