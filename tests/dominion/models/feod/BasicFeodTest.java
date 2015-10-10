package dominion.models.feod;

import dominion.models.feod.BasicFeod;
import dominion.models.feod.Feod;
import junit.framework.TestCase;

import static org.mockito.Mockito.*;


public class BasicFeodTest extends TestCase{

    public void testGetName() {
	FeodName name = mock(FeodName.class);
	Feod domain = new BasicFeod(name);
	assertEquals(name, domain.getName());
    }
    

}
