package dominion.base.feod;

import static org.mockito.Mockito.mock;

import dominion.base.persona.UnknownPersona;
import dominion.models.feod.FeodName;
import dominion.models.land.Land;
import junit.framework.TestCase;

public class BasicFeodTest extends TestCase {

    public void testGetName() {
	FeodName name = mock(FeodName.class);
	BasicFeod domain = new BasicFeod(name);
	assertEquals(name, domain.getName());
    }

    public void testHasSubDomains() {
	BasicFeod domain = this.createFeod();
	assertFalse(domain.hasSubDomains());

    }

    public void testGetLands() {
	BasicFeod domain = this.createFeod();
	assertEquals(0, domain.getLangs().size());
    }

    public void testIsSovereign() {
	BasicFeod domain = this.createFeod();
	assertTrue(domain.isSovereign());
    }

    public void testAddLand() {
	BasicFeod domain = this.createFeod();
	domain.addLand(mock(Land.class));
	assertEquals(1, domain.getLangs().size());
    }

    public void testGetSubDomains() {
	BasicFeod domain = this.createFeod();
	assertEquals(0, domain.getSubDomains().size());
    }
    
    public void testSetGetParentFeod(){
	BasicFeod domain = this.createFeod();
	BasicFeod parentFeod = this.createFeod();
	domain.setParentFeod(parentFeod);
	assertEquals(parentFeod, domain.getParentFeod());
    }
    
    public void testGetOwnerDeFacto(){
	BasicFeod domain = this.createFeod();
	assertEquals(UnknownPersona.class, domain.getOwnerDeFacto().getClass());
    }

    private BasicFeod createFeod() {
	FeodName name = mock(FeodName.class);
	return new BasicFeod(name);
    }

}
