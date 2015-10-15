package dominion.base.persona.name;

import dominion.models.persona.name.Anthroponym;

public abstract class AbstractAnthroponym implements Anthroponym {

    private String stringValue;

    public AbstractAnthroponym(String string) {
	this.stringValue = string;
    }

    public String toString() {
	return this.stringValue;
    }
}
