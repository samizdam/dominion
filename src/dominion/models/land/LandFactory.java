package dominion.models.land;

import dominion.models.Factory;
import dominion.models.culture.Culture;

public interface LandFactory extends Factory{

    void setCulture(Culture culture);

    Land createLand();

    Land createLand(LandName name);

    Land createLand(Culture culture);

}