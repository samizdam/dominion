package dominion.base.land.resource;

import dominion.models.land.resource.Resource;
import dominion.models.land.resource.ResourceMap;
import dominion.models.land.resource.ResourceType;
import junit.framework.TestCase;
//import static org.mockito.Mockito.mock;

public class BaseResourceMapTest extends TestCase {

    public void testAdd() {
	ResourceMap map = new BaseResourceMap();
	Resource resource = new BaseResource(ResourceType.money);
	map.add(resource);

    }

    public void testGet() {
	ResourceMap map = new BaseResourceMap();
	Resource resource = map.get(ResourceType.money);
	assertEquals(0, resource.toInt());
    }
}
