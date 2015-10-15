package dominion.base.feod;

import dominion.models.feod.Feod;
import dominion.models.land.Land;

public class FeodFactory {
    public Feod createFreeFeod(Land land){
	return new FreeFeod(land);
    }
}
