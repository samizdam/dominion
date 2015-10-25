package dominion.models.plugin;

import java.util.HashMap;
import java.util.Map;

import dominion.models.Factory;

public abstract class AbstractPlugin implements Plugin{

    protected Map<String, Factory> factoriesMap = new HashMap<String, Factory>();

    protected Map<String, Factory> getFactories() {
	return this.factoriesMap ;
    }
}
