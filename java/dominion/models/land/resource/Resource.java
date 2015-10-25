package dominion.models.land.resource;

import dominion.models.ValueObject;

public interface Resource extends ValueObject{

    int toInt();

    ResourceType getType();

    Resource merge(Resource resource);

}
