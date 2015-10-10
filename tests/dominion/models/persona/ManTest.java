package dominion.models.persona;

import junit.framework.TestCase;

public class ManTest extends TestCase {

    public void testGetGender() {
	Man man = new Man();
	assertEquals(Gender.male, man.getGender());
    }

}
