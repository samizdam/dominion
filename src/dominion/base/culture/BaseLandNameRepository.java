package dominion.base.culture;

import dominion.base.land.BaseLandName;
import dominion.models.land.LandName;
import dominion.models.land.LandNameRepository;

public class BaseLandNameRepository implements LandNameRepository {

    @Override
    public LandName getRangomName() {
	return new BaseLandName("Arcanar");
    }

}
