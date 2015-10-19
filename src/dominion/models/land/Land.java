package dominion.models.land;

import dominion.models.Entity;
import dominion.models.culture.Culture;
import dominion.models.event.EventsCollection;
import dominion.models.feod.Feod;
import dominion.models.land.resource.Resource;
import dominion.models.land.resource.ResourceType;

public interface Land extends Entity{
    
    public LandName getName();
    
    public void setDomain(Feod domain);
    
    public Feod getDomain();
    
    public Demos getDemos();
    
    public LandProfit getProfit();
    
    public EventsCollection addModifier(LandModifier mod);
    
    public Culture getDominantCulture();

    public Resource getResource(ResourceType type);
    
}
