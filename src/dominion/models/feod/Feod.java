package dominion.models.feod;

import java.util.List;

import dominion.models.Culture;
import dominion.models.Name;
import dominion.models.Profit;
import dominion.models.Title;
import dominion.models.land.Land;
import dominion.models.persona.*;

public interface Feod {
    
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
    
    public Persona getOwnerDeFacto();
    
    public Persona getOwnerDeJure();
    
    public void setOwnerDeFacto(Persona persona);
    
    public Culture getDominantCulture();
}
