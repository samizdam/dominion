package dominion.models.land.modifier;


import dominion.models.characteristic.Modifier;
import dominion.models.land.Land;
import dominion.models.land.events.LandModifierAppliedEvent;

public interface LandModifier extends Modifier{

    public LandModifierAppliedEvent apply(Land plot);

    public String getName();
}
