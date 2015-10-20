package dominion.base.land.event;

import dominion.models.event.Event;
import dominion.models.land.Land;
import dominion.models.land.events.LandModifierAppliedEvent;
import dominion.models.land.modifier.LandModifier;

public class BaseLandModifierApplied implements Event, LandModifierAppliedEvent {

    private LandModifier modifier;
    private Land land;

    @Override
    public String getMessage() {
	return "Modifier " + this.modifier.getName() + " was applied to " + this.land.getName();
    }
    
}
