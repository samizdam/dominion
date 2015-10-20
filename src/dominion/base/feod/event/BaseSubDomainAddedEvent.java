package dominion.base.feod.event;

import dominion.models.feod.Feod;
import dominion.models.feod.event.SubDomainAddedEvent;

public class BaseSubDomainAddedEvent implements SubDomainAddedEvent {

    private Feod subDomain;
    private Feod domain;

    @Override
    public String getMessage() {
	return "Sub-domain " + this.subDomain + "added to " + this.domain;
    }

}
