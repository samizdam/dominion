package dominion.base.persona.name;

import dominion.base.persona.name.BaseFirstName;
import dominion.base.persona.name.BasePersonaName;
import dominion.models.persona.name.FamilyName;
import junit.framework.TestCase;

public class BasePersonaNameTest extends TestCase {
    public void testGetFamilyName(){
	BasePersonaName name = new BasePersonaName("firstName", "familyName");
	assertTrue(name.getFamilyName() instanceof FamilyName);
    }
    
    public void testGetFirstName(){
	BasePersonaName name = new BasePersonaName("firstName", "familyName");
	assertTrue(name.getGivenName() instanceof BaseFirstName);
    }
}
