package dominion.models.land;

import dominion.models.Profit;
import dominion.models.land.resources.ResourceMap;

public interface LandProfit extends Profit{

    ResourceMap getResources();

}
