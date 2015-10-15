package dominion.models.culture.slavic;

import dominion.base.land.BaseDemos;
import dominion.models.land.Demos;
import dominion.models.land.DemosGenerator;

public class DozenDemosGenerator implements DemosGenerator {

    @Override
    public Demos generate() {
	BaseDemos demos = new BaseDemos();
	demos.setNumberOfMans(6);
	demos.setNumberOfWoman(6);
	return demos;
    }

}
