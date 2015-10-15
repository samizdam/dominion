package dominion.base.feod;

import static org.mockito.Mockito.mock;

import dominion.base.persona.UnknownPersona;
import dominion.models.feod.FeodName;
import dominion.models.land.Land;
import junit.framework.TestCase;

public class BaseFeodTest extends TestCase {

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
	BaseFeod parentFeod = this.createFeod();
	domain.setParentFeod(parentFeod);
	assertEquals(parentFeod, domain.getParentFeod());
    }
    
    public void testGetOwnerDeFacto(){
	BaseFeod domain = this.createFeod();
	assertEquals(UnknownPersona.class, domain.getOwnerDeFacto().getClass());
    }

    private BaseFeod createFeod() {
	FeodName name = mock(FeodName.class);
	return new BaseFeod(name);
    }

}