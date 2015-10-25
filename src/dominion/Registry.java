package dominion;

import dominion.models.Date;
import dominion.models.ServiceLocator;
import dominion.models.demos.DemosService;
import dominion.models.persona.PersonaService;

public class Registry implements ServiceLocator{

    private static ServiceLocator instance = new Registry();
    
    private PersonaService personaService;

    private DemosService demosService;

    private Registry() {
    }
    
    public static ServiceLocator getInstance(){
	return instance;
    }
    
    @Override
    public PersonaService getPersonaService() {
	return this.personaService;
    }

    public Date getCurrentDate() {
	return null;
    }

    @Override
    public void setPersonaService(PersonaService personaService) {
	this.personaService = personaService;
	
    }

    @Override
    public DemosService getDemosService() {
	return this.demosService;
    }

    @Override
    public void setDemosService(DemosService demosService) {
	this.demosService = demosService;
	
    }

}
