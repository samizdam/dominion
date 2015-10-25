package dominion.base.feod;

import static org.mockito.Mockito.mock;

import dominion.Registry;
import dominion.base.persona.BasePersonaService;
import dominion.models.feod.Feod;
import dominion.models.feod.FeodName;
import dominion.models.feod.event.SubDomainAddedEvent;
import dominion.models.land.Land;
import dominion.models.persona.UnknownPersona;
import junit.framework.TestCase;

public class BaseFeodTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
        Registry.getInstance().setPersonaService(new BasePersonaService());
        super.setUp();
    }
    
    public void testGetName() {
	FeodName name = mock(FeodName.class);
	BaseFeod domain = new BaseFeod(name);
	assertEquals(name, domain.getName());
    }

    public void testHasSubDomains() {
	BaseFeod domain = this.createFeod();
	assertFalse(domain.hasSubDomains());
    }

    public void testGetLands() {
	BaseFeod domain = this.createFeod();
	assertEquals(0, domain.getLangs().size());
    }

    public void testIsSovereign() {
	BaseFeod domain = this.createFeod();
	assertTrue(domain.isSovereign());
    }

    public void testAddLand() {
	BaseFeod domain = this.createFeod();
	domain.addLand(mock(Land.class));
	assertEquals(1, domain.getLangs().size());
    }

    public void testGetSubDomains() {
	BaseFeod domain = this.createFeod();
	assertEquals(0, domain.getSubDomains().size());
    }
    
    public void testSetGetParentFeod(){
	BaseFeod domain = this.createFeod();
	Feod parentFeod = mock(Feod.class); 
	domain.setParentFeod(parentFeod);
	assertEquals(parentFeod, domain.getParentFeod());
	assertFalse(domain.isSovereign());
    }
    
    public void testGetOwnerDeFacto(){
	BaseFeod domain = this.createFeod();
	assertTrue(domain.getOwnerDeFacto() instanceof UnknownPersona);
    }
    
    public void testAddSubDomain(){
	BaseFeod domain = this.createFeod();
	Feod sub = mock(Feod.class);
	assertTrue(domain.addSubDomain(sub) instanceof SubDomainAddedEvent);
	assertTrue(domain.hasSubDomains());
    }
    
    private BaseFeod createFeod() {
	FeodName name = mock(FeodName.class);
	return new BaseFeod(name);
    }

}
