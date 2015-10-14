package dominion.models.land.resources;


public interface Resource {

    int toInt();

    ResourceType getType();

    Resource merge(Resource resource);

}
