package dominion.models.culture.slavic;

import dominion.models.land.Demos;
import dominion.models.land.DemosGenerator;
import dominion.models.land.RegularDemos;

public class DozenDemosGenerator implements DemosGenerator {

    @Override
    public Demos generate() {
	RegularDemos demos = new RegularDemos();
	demos.setNumberOfMans(6);
	demos.setNumberOfWoman(6);
	return demos;
    }

}
