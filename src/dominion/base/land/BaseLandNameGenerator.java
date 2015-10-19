package dominion.base.land;

import dominion.models.land.LandName;
import dominion.models.land.LandNameGenerator;
import dominion.models.land.LandNameRepository;

public class BaseLandNameGenerator implements LandNameGenerator {

    private LandNameRepository repo;

    public BaseLandNameGenerator(LandNameRepository repo) {
	this.repo = repo;
    }

    @Override
    public LandName generate() {
	return this.repo.getRangomName();
    }

}
