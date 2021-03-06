package dominion.models.demos;

import dominion.models.Countable;
import dominion.models.Entity;

public interface Demos extends Countable, Entity {

    int count();
    
    int getNumberOfMans();
    
    int getNumberOfWomans();

    void putToDeath(int res);

}
