package dominion.models.land;

public class RegularLandName implements LandName {

    private String stringValue;

    public RegularLandName(String string) {
	this.stringValue = string;
    }

    public String toString() {
	return this.stringValue;
    }

}
