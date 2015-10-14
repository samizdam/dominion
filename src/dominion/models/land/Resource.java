package dominion.models.land;


public interface Resource {

    int toInt();

    ResourceType getType();

    Resource merge(Resource resource);

}
