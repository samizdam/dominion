package dominion.models.land.resource;

import java.util.HashMap;

public class BaseResourceMap extends HashMap<ResourceType, Resource> implements ResourceMap {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void add(Resource resource) {
	ResourceType type = resource.getType();
	if(this.containsKey(type)){
	    Resource currentValue = this.get(type);
	    Resource newValue = resource.merge(currentValue);
	    this.put(type, newValue);
	} else {
	    this.put(type, resource);
	}
    }

    public Resource get(ResourceType type){
	if(!this.containsKey(type)){
	    this.add(new BaseResource(type));
	}
	return super.get(type);
    }
}
