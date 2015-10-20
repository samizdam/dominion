package dominion.base.land.event;

import dominion.models.land.Land;
import dominion.models.land.events.LandModifierAddedEvent;
import dominion.models.land.modifier.LandModifier;

public class BaseLandModifierAdded implements LandModifierAddedEvent {

    private Land land;
    private LandModifier modifier;

    @Override
    public String getMessage() {
	return "Modifier " + this.modifier.getName() + " added to Land " + this.land.getName();
    }

}
