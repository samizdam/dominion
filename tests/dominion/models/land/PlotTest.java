package dominion.models.land;

import static org.mockito.Mockito.*;

import dominion.models.culture.slavic.SlavonianCulture;
import dominion.models.feod.Feod;
import junit.framework.TestCase;

public class PlotTest extends TestCase {
    
    private LandFactory factory = new LandFactory(new SlavonianCulture());
    
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
	assertEquals(12, land.getDemos().count());
    }
    
    public void testGetProfit(){
	Land land = this.createLand();
	assertTrue(land.getProfit() instanceof LandProfit);
    }
    
    public void testAddModifier(){
	Land land = this.createLand();
	
	LandModifier mod = new MergeProfitModifier();
	LandProfit landProfit = mock(LandProfit.class);
	ResourceMap resources = new BaseResourceMap();
	resources.add(new BaseResource(ResourceType.money, 100));
	
	when(landProfit.getResources()).thenReturn(resources);
	
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
