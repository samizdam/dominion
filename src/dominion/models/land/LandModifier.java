package dominion.models.land;


import dominion.models.characteristic.Modifier;

public interface LandModifier extends Modifier{

    public LandModifierAppliedEvent apply(Land plot);

    public String getName();
}
