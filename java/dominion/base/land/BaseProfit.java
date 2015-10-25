package dominion.base.land;

import dominion.models.land.Land;
import dominion.models.land.LandProfit;
import dominion.models.land.resource.ResourceMap;

class BaseProfit implements LandProfit {

    Land land;
    private ResourceMap resources;
    
    public BaseProfit(Land land) {
	this.land = land;
    }

    @Override
    public ResourceMap getResources() {
	return this.resources;
    }

}
