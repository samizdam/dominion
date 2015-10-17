package dominion.models.plugin;

import dominion.models.culture.Culture;
import dominion.models.land.LandFactory;

public interface LandPlugin {
    public LandFactory getLandFactory(Culture culture);
}
