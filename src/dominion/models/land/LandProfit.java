package dominion.models.land;

import dominion.models.Profit;
import dominion.models.land.resource.ResourceMap;

public interface LandProfit extends Profit{

    ResourceMap getResources();

}
