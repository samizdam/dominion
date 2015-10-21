package dominion.base.persona;

import static org.mockito.Mockito.mock;

import dominion.base.persona.event.BasePersonaModifierAdded;
import dominion.models.persona.Persona;
import dominion.models.persona.PersonaModifier;
import dominion.models.persona.WellBornPersona;
import dominion.models.persona.event.PersonaModifierAddedEvent;
import junit.framework.TestCase;

public class BasePersonaModifierAddedTest extends TestCase {
    public void testGetMessage(){
	WellBornPersona persona = mock(WellBornPersona.class); 
	PersonaModifier modifier = mock(PersonaModifier.class);
	BasePersonaModifierAdded event = new BasePersonaModifierAdded(persona, modifier);
	assertNotNull(event.getMessage());
    }
}
