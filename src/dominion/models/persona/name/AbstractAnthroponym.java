package dominion.models.persona.name;

public abstract class AbstractAnthroponym implements Anthroponym {

    private String stringValue;

    public AbstractAnthroponym(String string) {
	this.stringValue = string;
    }

    public String toString() {
	return this.stringValue;
    }
}
