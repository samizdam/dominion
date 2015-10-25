package dominion.base.land;

import dominion.models.demos.Demos;
import dominion.models.demos.DemosGenerator;

public class BaseDemosGenerator implements DemosGenerator {

    @Override
    public Demos generate() {
	BaseDemos demos = new BaseDemos();
	demos.setNumberOfMans(5);
	demos.setNumberOfWoman(5);
	return demos;
    }

}
