package dominion.models.land.resources;

import java.util.Map;

public interface ResourceMap extends Map<ResourceType, Resource>{

    void add(Resource resource);

}
