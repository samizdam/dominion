package dominion.base.land;

import dominion.models.culture.Culture;
import dominion.models.land.Demos;
import dominion.models.land.Land;
import dominion.models.land.LandName;

public class LandFactory {

    private Culture culture;

    public LandFactory(Culture culture) {
	this.setCulture(culture);
    }

    public void setCulture(Culture culture) {
	this.culture = culture;
    }

    public Land createLand() {
	return this.createLand(this.culture);
    }
    
    public Land createLand(LandName name){
	Demos demos = culture.getDemosGenerator().generate();
	return new Plot(name, demos);
    }

    public Land createLand(Culture culture) {
	LandName name = culture.getLandNameGenerator().generate();
	Demos demos = culture.getDemosGenerator().generate();
	return new Plot(name, demos);
    }
}
