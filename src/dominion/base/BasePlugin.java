package dominion.base;

import java.util.HashMap;
import java.util.Map;

import dominion.base.land.BaseLandFactory;
import dominion.base.persona.BasePersonaFactory;
import dominion.models.Factory;
import dominion.models.culture.Culture;
import dominion.models.land.LandFactory;
import dominion.models.persona.PersonaFactory;
import dominion.models.plugin.LandPlugin;
import dominion.models.plugin.PersonaPlugin;
import dominion.models.plugin.Plugin;

public class BasePlugin implements Plugin, PersonaPlugin, LandPlugin{

    private Map<String, Factory> factoriesMap = new HashMap<String, Factory>();

    @Override
    public Map<String, Factory> getFactories() {
	return this.factoriesMap ;
    }

    @Override
    public PersonaFactory getPersonaFactory(Culture culture) {
	String factoryName = PersonaFactory.class.toString();
	this.factoriesMap.put(factoryName, new BasePersonaFactory(culture));
	return (PersonaFactory) this.factoriesMap.get(PersonaFactory.class.toString());
    }

    @Override
    public LandFactory getLandFactory(Culture culture) {
	String factoryName  = LandFactory.class.toString();
	this.factoriesMap.put(factoryName, new BaseLandFactory(culture));
	return (LandFactory) this.factoriesMap.get(factoryName);
    }

}
