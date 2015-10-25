package dominion.base.land.event;

import static org.mockito.Mockito.mock;

import dominion.models.land.Land;
import dominion.models.land.modifier.LandModifier;
import junit.framework.TestCase;

public class BaseLandModifierAppliedTest extends TestCase {

    public void testGetMessage(){
	Land land = mock(Land.class);
	LandModifier mod = mock(LandModifier.class);
	BaseLandModifierApplied event = new BaseLandModifierApplied(land, mod);
	assertNotNull(event.getMessage());
    }
}
