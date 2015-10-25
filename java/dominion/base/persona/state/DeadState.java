package dominion.base.persona.state;

import dominion.models.StateName;
import dominion.models.persona.State;

public class DeadState implements State{

    private StateName name = new BaseStateName("dead");

    @Override
    public StateName getName() {
	return this.name;
    }

}
