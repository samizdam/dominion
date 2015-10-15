package dominion.base.land;

import dominion.models.land.Demos;
import dominion.models.land.DemosGenerator;

public class BaseDemosGenerator implements DemosGenerator {

    @Override
    public Demos generate() {
	BaseDemos demos = new BaseDemos();
	demos.setNumberOfMans(5);
	demos.setNumberOfWoman(5);
	return demos;
    }

}
