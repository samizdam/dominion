package dominion.base.persona.state;

import dominion.models.Factory;
import dominion.models.persona.State;

public class StateFactory implements Factory{
    public State getState(String nameStringValue){
	return new DeadState();
    }
}
