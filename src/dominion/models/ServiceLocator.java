package dominion.models;
import dominion.models.demos.DemosService;
import dominion.models.persona.PersonaService;

public interface ServiceLocator {
    
    public PersonaService getPersonaService();

    public Date getCurrentDate();

    public void setPersonaService(PersonaService personaService);

    public DemosService getDemosService();

    public void setDemosService(DemosService demosService);
}
