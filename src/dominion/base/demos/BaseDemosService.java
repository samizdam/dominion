package dominion.base.demos;

import dominion.models.demos.DemosGenerator;
import dominion.models.demos.DemosService;

public class BaseDemosService implements DemosService {

    @Override
    public DemosGenerator getGenerator() {
	return new BaseDemosGenerator();
    }

}
