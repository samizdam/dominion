package dominion.base.land;

import dominion.Registry;
import dominion.models.culture.Culture;
import dominion.models.demos.Demos;
import dominion.models.land.Land;
import dominion.models.land.LandFactory;
import dominion.models.land.LandName;

class BaseLandFactory implements LandFactory {

    private Culture culture;

    public BaseLandFactory(Culture culture) {
	this.setCulture(culture);
    }

    /* (non-Javadoc)
     * @see dominion.base.land.LandFactory#setCulture(dominion.models.culture.Culture)
     */
    @Override
    public void setCulture(Culture culture) {
	this.culture = culture;
    }

    /* (non-Javadoc)
     * @see dominion.base.land.LandFactory#createLand()
     */
    @Override
    public Land createLand() {
	return this.createLand(this.culture);
    }
    
    /* (non-Javadoc)
     * @see dominion.base.land.LandFactory#createLand(dominion.models.land.LandName)
     */
    @Override
    public Land createLand(LandName name){
	Demos demos = Registry.getInstance().getDemosService().getGenerator().generate();
	return new BaseLand(name, demos);
    }

    /* (non-Javadoc)
     * @see dominion.base.land.LandFactory#createLand(dominion.models.culture.Culture)
     */
    @Override
    public Land createLand(Culture culture) {
	LandName name = culture.getLandNameGenerator().generate();
	Demos demos = culture.getDemosGenerator().generate();
	return new BaseLand(name, demos);
    }
}
