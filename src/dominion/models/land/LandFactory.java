package dominion.models.land;

import dominion.models.culture.Culture;

public interface LandFactory {

    void setCulture(Culture culture);

    Land createLand();

    Land createLand(LandName name);

    Land createLand(Culture culture);

}