package dominion.base.land;

import static org.mockito.Mockito.mock;

import dominion.Registry;
import dominion.base.culture.BaseCulture;
import dominion.base.demos.BaseDemosService;
import dominion.models.feod.Feod;
import dominion.models.land.Land;
import dominion.models.land.LandFactory;
import dominion.models.land.LandName;
import dominion.models.land.LandProfit;
import dominion.models.land.events.LandModifierAddedEvent;
import dominion.models.land.modifier.LandModifier;
import junit.framework.TestCase;

public class BaseLandTest extends TestCase {

    private LandFactory factory = new BaseLandFactory(new BaseCulture());
    
    @Override
    protected void setUp() throws Exception {
        Registry.getInstance().setDemosService(new BaseDemosService());
        super.setUp();
    }

    public void testGetName() {
	LandName name = mock(LandName.class);
	Land land = this.createLand(name);
	assertEquals(name, land.getName());

    }

    public void testSetDomain() {
	Land land = this.createLand();
	Feod domain = mock(Feod.class);
	land.setDomain(domain);
	assertEquals(domain, land.getDomain());
    }

    public void testDemos() {
	Land land = this.createLand();
	assertEquals(10, land.getDemos().count());
    }

    public void testGetProfit() {
	Land land = this.createLand();
	assertTrue(land.getProfit() instanceof LandProfit);
    }

    public void testAddModifier() {
	Land land = this.createLand();
	LandModifier mod = mock(LandModifier.class);
	assertTrue(land.addModifier(mod) instanceof LandModifierAddedEvent);
    }

    private Land createLand(LandName name) {
	return this.factory.createLand(name);
    }

    private Land createLand() {
	LandName name = mock(LandName.class);
	return this.createLand(name);
    }

}
