package dominion.models.plugin;

import dominion.models.land.LandService;

public interface LandPlugin extends Plugin{
    public LandService getLandService();
}
