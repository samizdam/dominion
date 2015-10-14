package dominion.models.land;

import dominion.models.culture.Culture;
import dominion.models.feod.Feod;

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
