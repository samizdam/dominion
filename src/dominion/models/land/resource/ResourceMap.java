package dominion.models.land.resource;

import java.util.Map;

public interface ResourceMap extends Map<ResourceType, Resource>{

    void add(Resource resource);

}
