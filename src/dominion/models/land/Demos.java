package dominion.models.land;

import dominion.models.Countable;
import dominion.models.Entity;

public interface Demos extends Countable, Entity {

    int count();
    
    int getNumberOfMans();
    
    int getNumberOfWomans();

}
