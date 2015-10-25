package dominion.models.land;

import dominion.models.Entity;
import dominion.models.culture.Culture;
import dominion.models.demos.Demos;
import dominion.models.feod.Feod;
import dominion.models.land.events.LandModifierAddedEvent;
import dominion.models.land.modifier.LandModifier;
import dominion.models.land.resource.Resource;
import dominion.models.land.resource.ResourceType;

public interface Land extends Entity{
    
    public LandName getName();
    
    public void setDomain(Feod domain);
    
    public Feod getDomain();
    
    public Demos getDemos();
    
    public LandProfit getProfit();
    
    public LandModifierAddedEvent addModifier(LandModifier mod);
    
    public Culture getDominantCulture();

    public Resource getResource(ResourceType type);
    
}
