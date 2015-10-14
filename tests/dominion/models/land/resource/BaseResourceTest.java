package dominion.models.land.resource;

import junit.framework.TestCase;

public class BaseResourceTest extends TestCase {

    public void testMerge(){
	Resource resource = new BaseResource(ResourceType.money);
	assertEquals(10, resource.merge(new BaseResource(ResourceType.money, 10)).toInt());
    }
}
