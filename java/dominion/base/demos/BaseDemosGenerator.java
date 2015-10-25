package dominion.base.demos;

import dominion.models.demos.Demos;
import dominion.models.demos.DemosGenerator;

class BaseDemosGenerator implements DemosGenerator {

    @Override
    public Demos generate() {
	BaseDemos demos = new BaseDemos();
	demos.setNumberOfMans(5);
	demos.setNumberOfWoman(5);
	return demos;
    }

}
