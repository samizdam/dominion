package dominion.base.land.modifier;

import dominion.base.land.event.BaseLandModifierApplied;
import dominion.models.demos.Demos;
import dominion.models.land.Land;
import dominion.models.land.events.LandModifierAppliedEvent;

class BaseDemosMortalityModifier extends AbstractLandModifier {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public LandModifierAppliedEvent apply(Land land) {
	Demos demos = land.getDemos();
	int mans = demos.getNumberOfMans();
	int womans = demos.getNumberOfWomans();
	int total = mans + womans;
	float res = total / 100;
	demos.putToDeath((int) res);
	return new BaseLandModifierApplied(land, this);
    }

    @Override
    public String getName() {
	// TODO Auto-generated method stub
	return null;
    }

}
