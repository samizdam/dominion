package dominion.models.culture.slavic;

import dominion.base.land.RegularDemos;
import dominion.models.land.Demos;
import dominion.models.land.DemosGenerator;

public class DozenDemosGenerator implements DemosGenerator {

    @Override
    public Demos generate() {
	RegularDemos demos = new RegularDemos();
	demos.setNumberOfMans(6);
	demos.setNumberOfWoman(6);
	return demos;
    }

}
