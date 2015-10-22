package dominion.base.persona.state;

import dominion.base.persona.state.DeadState;
import junit.framework.TestCase;

public class DeadStateTest extends TestCase {
    public void testGetName(){
	DeadState state = new DeadState();
	assertEquals("dead", state.getName().toString());
    }
}
