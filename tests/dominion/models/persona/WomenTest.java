package dominion.models.persona;

import junit.framework.TestCase;

public class WomenTest extends TestCase {

    public void testGetGender(){
	Woman woman = new Woman();
	assertEquals(Gender.female, woman.getGender());
    }
}
