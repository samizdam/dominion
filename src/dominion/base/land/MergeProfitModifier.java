package dominion.base.land;

import dominion.models.land.Land;
import dominion.models.land.LandModifierAppliedEvent;

class MergeProfitModifier extends AbstractLandModifier {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public LandModifierAppliedEvent apply(Land plot) {
	return new BaseLandModifierAppliedEvent();
    }

    @Override
    public String getName() {
	// TODO Auto-generated method stub
	return null;
    }

}
