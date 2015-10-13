package dominion.models.culture.slavic;

import dominion.models.land.LandName;
import dominion.models.land.LandNameGenerator;

public class DefaultSlavicLandNameGenerator implements LandNameGenerator {

    
    
    private LandNameRepository repo;
    
    public DefaultSlavicLandNameGenerator(LandNameRepository repo) {
	this.repo = repo;
    }
    @Override
    public LandName generate() {
	return this.repo.getRangomName();
    }

}
