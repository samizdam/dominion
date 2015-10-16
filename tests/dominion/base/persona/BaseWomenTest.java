package dominion.base.persona;

import static org.mockito.Mockito.mock;

import dominion.base.persona.Man;
import dominion.base.persona.BasePersonaFactory;
import dominion.base.persona.BaseWoman;
import dominion.models.culture.slavic.SlavonianCulture;
import dominion.models.persona.Gender;
import dominion.models.persona.PersonaFactory;
import dominion.models.persona.Woman;
import junit.framework.TestCase;

public class BaseWomenTest extends TestCase {

    private PersonaFactory personaFactory = new BasePersonaFactory(new SlavonianCulture()); 
    
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
    
    public void testGetCulture(){
	Woman woman = this.createWoman();
	assertTrue(woman.getCulture() instanceof SlavonianCulture);
    }

    private Woman createWoman() {
	return this.personaFactory.createWoman(mock(Man.class), mock(BaseWoman.class));
    }

}
