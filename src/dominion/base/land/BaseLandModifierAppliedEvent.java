package dominion.base.land;

import dominion.models.event.Event;
import dominion.models.land.Land;
import dominion.models.land.LandModifier;
import dominion.models.land.LandModifierAppliedEvent;

public class BaseLandModifierAppliedEvent implements Event, LandModifierAppliedEvent {

    private LandModifier modifier;
    private Land land;

    @Override
    public String getMessage() {
	return "Modifier " + this.modifier.getName() + " was applied to " + this.land.getName();
    }
    
}
