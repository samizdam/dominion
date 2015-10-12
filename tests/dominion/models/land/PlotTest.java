package dominion.models.land;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class PlotTest extends TestCase {
    public void testGetName(){
	LandName name = mock(LandName.class);
	Land land = new Plot(name);
	assertEquals(name, land.getName());
    }
}
