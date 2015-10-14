package dominion.models.characteristic;

public class LimitedCharacteristicValue implements CharacteristicValue {

    private Characteristic characteristic;
    private int value = 0;
    private short limit = 100;

    public LimitedCharacteristicValue(Characteristic characteristic) {
	this.characteristic = characteristic;
    }
    
    public LimitedCharacteristicValue(Characteristic characteristic, int value) {
	this.characteristic = characteristic;
	this.value = value;
    }

    @Override
    public int toInt() {
	return this.value;
    }

    @Override
    public CharacteristicValue merge(CharacteristicValue value) {
	int oldValue = this.toInt();
	int newValue = oldValue + value.toInt();
	if(newValue >= this.limit){
	    newValue = this.limit;
	}
	return new LimitedCharacteristicValue(this.characteristic, newValue);
    }


}
