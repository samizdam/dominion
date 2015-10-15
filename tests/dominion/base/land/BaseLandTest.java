package dominion.base.land;

import static org.mockito.Mockito.mock;

import dominion.models.culture.slavic.SlavonianCulture;
import dominion.models.event.EventsCollection;
import dominion.models.feod.Feod;
import dominion.models.land.Land;
import dominion.models.land.LandFactory;
import dominion.models.land.LandModifier;
import dominion.models.land.LandName;
import dominion.models.land.LandProfit;
import junit.framework.TestCase;

public class BaseLandTest extends TestCase {
    
    private LandFactory factory = new BaseLandFactory(new SlavonianCulture());
    
    public void testGetName() {
	LandName name = mock(LandName.class);
	Land land = this.createLand(name);
	assertEquals(name, land.getName());
	
    }
    
    public void testSetDomain(){
	Land land = this.createLand();
	Feod domain = mock(Feod.class);
	land.setDomain(domain);
	assertEquals(domain, land.getDomain());
    }
    
    public void testDemos(){
	Land land = this.createLand();
	assertEquals(10, land.getDemos().count());
    }
    
    public void testGetProfit(){
	Land land = this.createLand();
	assertTrue(land.getProfit() instanceof LandProfit);
    }
    
    public void testAddModifier(){
	Land land = this.createLand();
	LandModifier mod = new MergeProfitModifier();
	assertTrue(land.addModifier(mod) instanceof EventsCollection);
    }
    
    private Land createLand(LandName name){
	return this.factory.createLand(name);	
    }
    
    private Land createLand(){
	LandName name = mock(LandName.class);
	return this.createLand(name);	
    }
    
    
}
