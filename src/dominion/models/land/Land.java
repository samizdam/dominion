package dominion.models.land;

import dominion.models.culture.Culture;
import dominion.models.feod.Feod;

public interface Land {
    
    public LandName getName();
    
    public void setDomain(Feod domain);
    
    public Feod getDomain();
    
    public LandProfit getProfit();
    
    public void addModifier(LandModifier mod);
    
    public Culture getDominantCulture();
    
}
