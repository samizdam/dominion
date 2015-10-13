package dominion.models.land;

import dominion.models.characteristic.Modifier;

public interface LandModifier extends Modifier{
    
    public LandProfit getProfit();
}
