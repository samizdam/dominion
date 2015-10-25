package dominion.base.persona.name;

import junit.framework.TestCase;

public class BaseUnknownPersonaNameTest extends TestCase {

    public void testToString(){
	UnknownPersonaName fullName = new UnknownPersonaName();
	assertEquals("unknown unknown", fullName.toString());
    }
}
