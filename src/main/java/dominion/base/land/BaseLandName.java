package dominion.base.land;

import dominion.models.land.LandName;

/**
 * TODO make not public.
 * @author samizdam
 *
 */
public class BaseLandName implements LandName {

    private String stringValue;

    public BaseLandName(String string) {
	this.stringValue = string;
    }

    public String toString() {
	return this.stringValue;
    }

}
