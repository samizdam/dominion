package dominion.base.feod.event;

import dominion.models.feod.Feod;
import junit.framework.TestCase;
import static org.mockito.Mockito.mock;

public class BaseSubDomainAddedEventTest extends TestCase {

    public void testGetMessage(){
	Feod parent = mock(Feod.class);
	Feod sub = mock(Feod.class);
	BaseSubDomainAddedEvent event = new BaseSubDomainAddedEvent(parent, sub);
	assertNotNull(event.getMessage());
    }
}
