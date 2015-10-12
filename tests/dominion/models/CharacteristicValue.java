package dominion.models;

public interface CharacteristicValue extends ValueObject{

    int toInt();

    CharacteristicValue merge(CharacteristicValue value);

}
