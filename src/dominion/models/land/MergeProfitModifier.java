package dominion.models.land;

import dominion.models.BaseEventCollection;
import dominion.models.characteristic.Characteristic;
import dominion.models.characteristic.CharacteristicValue;
import dominion.models.event.EventsCollection;

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
    public EventsCollection apply(Plot plot) {
	return new BaseEventCollection(new LandModifierApplied());
    }

    @Override
    public CharacteristicValue get(Characteristic character) {
	// TODO Auto-generated method stub
	return null;
    }

}
