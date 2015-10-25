package dominion.base.land.resource;

import dominion.models.land.resource.Resource;
import dominion.models.land.resource.ResourceType;
import junit.framework.TestCase;

public class BaseResourceTest extends TestCase {

    public void testMerge(){
	Resource resource = new BaseResource(ResourceType.money);
	assertEquals(10, resource.merge(new BaseResource(ResourceType.money, 10)).toInt());
    }
}
