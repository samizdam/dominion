package dominion.base.persona;

import dominion.base.persona.name.UnknownPersonaName;
import dominion.base.persona.state.DeadState;
import junit.framework.TestCase;

public class BaseUnknownPersonaTest extends TestCase {
    public void testGetName() {
	BaseUnknownPersona persona = new BaseUnknownPersona();
	assertTrue(persona.getName() instanceof UnknownPersonaName);
    }

    public void testGetState() {
	BaseUnknownPersona persona = new BaseUnknownPersona();
	assertTrue(persona.getState() instanceof DeadState);
    }

}
