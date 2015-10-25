package dominion.base.persona;

import static org.mockito.Mockito.mock;

import dominion.models.persona.Man;
import dominion.models.persona.Woman;
import junit.framework.TestCase;

public class BasePersonaServiceTest extends TestCase {

    public void testCreateMan(){
	BasePersonaService service = new BasePersonaService();
	assertTrue(service.createMan(mock(Man.class), mock(Woman.class)) instanceof Man);
    }
    
    public void testCreateWoman(){
	BasePersonaService service = new BasePersonaService();
	assertTrue(service.createWoman(mock(Man.class), mock(Woman.class)) instanceof Woman);
	
    }
}
