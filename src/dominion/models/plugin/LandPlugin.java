package dominion.models.plugin;

import dominion.models.culture.Culture;
import dominion.models.land.LandFactory;

public interface LandPlugin extends Plugin{
    public LandFactory getLandFactory(Culture culture);
}
