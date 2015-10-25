package dominion.models;

import dominion.models.persona.PersonaService;

public interface ServiceLocator {
    
    public PersonaService getPersonaService();

    public Date getCurrentDate();

    public void setPersonaService(PersonaService basePersonaService);
}
