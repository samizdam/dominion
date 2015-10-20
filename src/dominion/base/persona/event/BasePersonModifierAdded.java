package dominion.base.persona.event;

import dominion.models.persona.PersonaModifier;
import dominion.models.persona.WellBornPersona;
import dominion.models.persona.event.PersonaModifierAddedEvent;

public class BasePersonModifierAdded implements PersonaModifierAddedEvent {

    private PersonaModifier modifier;
    private WellBornPersona persona;

    public BasePersonModifierAdded(WellBornPersona persona, PersonaModifier modifier) {
	this.persona = persona;
	this.modifier = modifier;
    }
    @Override
    public String getMessage() {
	return "Modifier " + this.modifier.getName() + " added to Persona " + this.persona.getName();
    }

}
