package dominion.models.plugin;

import java.util.Map;

import dominion.models.Factory;

public interface Plugin {
    public Map<String, Factory> getFactories();
}
