package dominion.base;

import dominion.base.land.BaseLandService;
import dominion.base.persona.BasePersonaService;
import dominion.models.land.LandService;
import dominion.models.persona.PersonaService;
import dominion.models.plugin.AbstractPlugin;
import dominion.models.plugin.LandPlugin;
import dominion.models.plugin.PersonaPlugin;

public class BasePlugin extends AbstractPlugin implements PersonaPlugin, LandPlugin {

    private PersonaService personaService = new BasePersonaService();
    private LandService landService = new BaseLandService(); 
    

    @Override
    public PersonaService getPersonaService() {
	return this.personaService;
    }


    @Override
    public LandService getLandService() {
	return this.landService ;
    }

}
