package dominion.models.land;

import static org.mockito.Mockito.*;

import dominion.models.feod.Feod;
import junit.framework.TestCase;

public class PlotTest extends TestCase {
    public void testGetName() {
	LandName name = mock(LandName.class);
	Land land = new Plot(name);
	assertEquals(name, land.getName());
    }
    
    public void testSetDomain(){
	Land land = this.createLand();
	Feod domain = mock(Feod.class);
	land.setDomain(domain);
	assertEquals(domain, land.getDomain());
    }
    
    private Land createLand(LandName name){
	return new Plot(name);	
    }
    
    private Land createLand(){
	LandName name = mock(LandName.class);
	return this.createLand(name);	
    }
    
    
}
