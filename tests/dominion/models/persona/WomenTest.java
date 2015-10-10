package dominion.models.persona;

import static org.mockito.Mockito.mock;

import dominion.models.persona.name.Woman;
import junit.framework.TestCase;

public class WomenTest extends TestCase {

    public void testGetGender() {
	Woman woman = new Woman(mock(Man.class), mock(Woman.class));
	assertEquals(Gender.female, woman.getGender());
    }

    public void testGetSpouse() {
	Woman woman = new Woman(mock(Man.class), mock(Woman.class));
	assertNull(woman.getSpouse());
    }
    
    public void testIsMarried(){
	Woman woman = new Woman(mock(Man.class), mock(Woman.class));
	assertFalse(woman.isMarried());
    }
    
}
