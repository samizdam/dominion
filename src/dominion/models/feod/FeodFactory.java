package dominion.models.feod;

import dominion.models.land.Land;

public class FeodFactory {
    public Feod createFreeFeod(Land land){
	return new FreeFeod(land);
    }
}
