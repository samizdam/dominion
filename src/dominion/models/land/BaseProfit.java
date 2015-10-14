package dominion.models.land;

import dominion.models.land.resources.ResourceMap;

public class BaseProfit implements LandProfit {

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
