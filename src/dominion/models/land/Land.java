package dominion.models.land;

import dominion.models.culture.Culture;
import dominion.models.events.EventsCollection;
import dominion.models.feod.Feod;
import dominion.models.land.resources.Resource;
import dominion.models.land.resources.ResourceType;

public interface Land {
    
    public LandName getName();
    
    public void setDomain(Feod domain);
    
    public Feod getDomain();
    
    public Demos getDemos();
    
    public LandProfit getProfit();
    
    public EventsCollection addModifier(LandModifier mod);
    
    public Culture getDominantCulture();

    public Resource getResource(ResourceType type);
    
}
