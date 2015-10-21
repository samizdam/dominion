package dominion.base.persona;

import dominion.models.StateName;
import dominion.models.persona.State;

public class DeadState implements State{

    private StateName name;

    @Override
    public StateName getName() {
	return this.name;
    }

}
