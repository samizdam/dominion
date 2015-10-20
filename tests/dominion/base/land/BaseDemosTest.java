package dominion.base.land;

import junit.framework.TestCase;

public class BaseDemosTest extends TestCase {

    public void testPutToDeath(){
	BaseDemos demos = new BaseDemos();
	demos.setNumberOfMans(5);
	demos.setNumberOfWoman(5);
	demos.putToDeath(2);
	assertEquals(8, demos.count());
    }
}
