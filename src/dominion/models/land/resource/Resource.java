package dominion.models.land.resource;


public interface Resource {

    int toInt();

    ResourceType getType();

    Resource merge(Resource resource);

}
