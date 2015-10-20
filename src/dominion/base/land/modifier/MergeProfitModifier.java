package dominion.base.land.modifier;

import dominion.base.land.event.BaseLandModifierApplied;
import dominion.models.land.Land;
import dominion.models.land.events.LandModifierAppliedEvent;

class MergeProfitModifier extends AbstractLandModifier {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public LandModifierAppliedEvent apply(Land plot) {
	return new BaseLandModifierApplied();
    }

    @Override
    public String getName() {
	// TODO Auto-generated method stub
	return null;
    }

}
