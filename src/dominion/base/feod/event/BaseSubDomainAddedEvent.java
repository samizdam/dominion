package dominion.base.feod.event;

import dominion.models.feod.Feod;
import dominion.models.feod.event.SubDomainAddedEvent;

public class BaseSubDomainAddedEvent implements SubDomainAddedEvent {

    private Feod subDomain;
    private Feod domain;

    public BaseSubDomainAddedEvent(Feod parent, Feod sub) {
	this.domain = parent;
	this.subDomain = sub;
    }
    
    @Override
    public String getMessage() {
	return "Sub-domain " + this.subDomain.getName() + " added to " + this.domain.getName();
    }

}
