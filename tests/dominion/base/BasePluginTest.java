package dominion.base;

import dominion.models.culture.Culture;
import junit.framework.TestCase;
import static org.mockito.Mockito.mock;

public class BasePluginTest extends TestCase {

    public void testGetLandFactory() {
	BasePlugin plugin = new BasePlugin();
	assertNotNull(plugin.getLandFactory(mock(Culture.class)));
    }
    
    public void testGetPersonaFactory(){
	BasePlugin plugin = new BasePlugin();
	assertNotNull(plugin.getPersonaFactory(mock(Culture.class)));
    }
}
