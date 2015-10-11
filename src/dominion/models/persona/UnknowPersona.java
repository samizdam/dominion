package dominion.models.persona;

import dominion.models.persona.name.PersonaName;

public class UnknowPersona implements Persona{

    private PersonaName name;
    @Override
    public PersonaName getName() {
	return this.name;
    }

}
