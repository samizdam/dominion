package dominion.base.land;

import dominion.base.BaseEventCollection;
import dominion.models.characteristic.Characteristic;
import dominion.models.characteristic.CharacteristicValue;
import dominion.models.event.EventsCollection;
import dominion.models.land.LandProfit;

public class MergeProfitModifier extends AbstractProfitModifier {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private LandProfit profit;

    @Override
    public LandProfit getProfit() {
	return this.profit;
    }

    @Override
    public EventsCollection apply(BaseLand plot) {
	return new BaseEventCollection(new LandModifierApplied());
    }

    @Override
    public CharacteristicValue get(Characteristic character) {
	// TODO Auto-generated method stub
	return null;
    }

}