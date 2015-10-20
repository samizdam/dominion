package dominion.base.persona.event;

import dominion.models.persona.PersonaModifier;
import dominion.models.persona.WellBornPersona;
import dominion.models.persona.event.PersonaModifierAddedEvent;

public class BasePersonModifierAdded implements PersonaModifierAddedEvent {

    private PersonaModifier modifier;
    private WellBornPersona persona;

    @Override
    public String getMessage() {
	return "Modifier " + this.modifier + " added to Persona " + this.persona;
    }

}
