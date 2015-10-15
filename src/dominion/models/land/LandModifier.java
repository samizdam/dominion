package dominion.models.land;

import dominion.base.land.BaseLand;
import dominion.models.characteristic.Modifier;
import dominion.models.event.EventsCollection;

public interface LandModifier extends Modifier{
    
    public LandProfit getProfit();

    public EventsCollection apply(BaseLand plot);
}
