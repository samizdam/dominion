package dominion.models.land.resources;

public class BaseResource implements Resource {

    private ResourceType type;
    private int intValue;

    /**
     * Create Resource with given value.
     * 
     * @param type
     * @param intValue
     */
    public BaseResource(ResourceType type, int intValue) {
	this.type = type;
	this.intValue = intValue;
    }

    /**
     * Create Resource with zero value.
     * 
     * @param type
     */
    public BaseResource(ResourceType type) {
	this(type, 0);
    }

    @Override
    public int toInt() {
	return this.intValue;
    }

    @Override
    public ResourceType getType() {
	return this.type;
    }

    @Override
    public Resource merge(Resource resource) {
	// TODO Auto-generated method stub
	return null;
    }

//    @Override
//    public CharacteristicValue merge(CharacteristicValue value) {
//	return value.merge(this);
//    }

}
