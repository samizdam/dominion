package dominion.models.persona;

import static org.mockito.Mockito.mock;

import dominion.models.culture.slavic.SlavonianCulture;
import junit.framework.TestCase;

public class WomenTest extends TestCase {

    private PersonaFactory personaFactory = new PersonaFactory(new SlavonianCulture()); 
    
    public void testGetGender() {
	Woman woman = this.createWoman();
	assertEquals(Gender.female, woman.getGender());
    }

    public void testGetSpouse() {
	Woman woman = this.createWoman();
	assertNull(woman.getSpouse());
    }

    public void testIsMarried() {
	Woman woman = this.createWoman();
	assertFalse(woman.isMarried());
    }

    private Woman createWoman() {
	return this.personaFactory.createWoman(mock(Man.class), mock(Woman.class));
    }

}
