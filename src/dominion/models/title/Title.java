package dominion.models.title;

import dominion.models.Entity;
import dominion.models.feod.Feod;

public interface Title extends Entity{
    
    public TitleName getName();
    
    public Feod getFeod();
}
