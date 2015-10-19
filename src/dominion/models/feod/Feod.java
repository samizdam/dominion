package dominion.models.feod;

import java.util.List;

import dominion.models.Entity;
import dominion.models.Name;
import dominion.models.Profit;
import dominion.models.culture.Culture;
import dominion.models.land.Land;
import dominion.models.persona.*;
import dominion.models.title.Title;

public interface Feod extends Entity{
    
    public Title getTitle();
    
    public Name getName();
    
    public void addSubDomain(Feod domain) throws Exception;

    public List<Feod> getSubDomains();
    
    public void addLand(Land land);
    
    public List<Land> getLangs();
    
    public Profit getProfit();
    
    public boolean hasSubDomains();
    
    public boolean isSovereign();
    
    public void setParentFeod(Feod feod);
    
    public Feod getParentFeod();
    
    public Persona getOwnerDeFacto();
    
    public Persona getOwnerDeJure();
    
    public void setOwnerDeFacto(Persona persona);
    
    public Culture getDominantCulture();
}
