package dominion.base.persona.state;

import dominion.models.StateName;

public class BaseStateName implements StateName {

    private String stringValue;

    public BaseStateName(String stringValue) {
	this.stringValue = stringValue;
    }

    @Override
    public String toString() {
        return this.stringValue;
    }
}
