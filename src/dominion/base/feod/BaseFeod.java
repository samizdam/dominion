package dominion.base.feod;

import java.util.ArrayList;
import java.util.List;

import dominion.base.feod.event.BaseSubDomainAddedEvent;
import dominion.base.persona.BaseUnknownPersona;
import dominion.models.Profit;
import dominion.models.feod.Feod;
import dominion.models.feod.FeodName;
import dominion.models.feod.event.SubDomainAddedEvent;
import dominion.models.persona.Persona;
import dominion.models.title.Title;

class BaseFeod extends AbstractFeod {

    BaseFeod(FeodName name) {
	super(name);
    }


    private Profit profit;
    private List<Feod> subDomains = new ArrayList<Feod>();
    private Title title;
    private Feod parentFeod;
    private Persona ownerDeFacto = new BaseUnknownPersona();
    private Persona ownerDeJure;

    @Override
    public SubDomainAddedEvent addSubDomain(Feod domain) {
	return new BaseSubDomainAddedEvent();

    }

    @Override
    public List<Feod> getSubDomains() {
	return this.subDomains;
    }

    @Override
    public Profit getProfit() {
	return this.profit;
    }

    @Override
    public Title getTitle() {
	return this.title;
    }

    @Override
    public boolean hasSubDomains() {
	return !this.subDomains.isEmpty();
    }

    
    @Override
    public boolean isSovereign() {
	return this.parentFeod == null;
    }

    @Override
    public void setParentFeod(Feod feod) {
	this.parentFeod = feod;
    }

    @Override
    public Persona getOwnerDeFacto() {
	return this.ownerDeFacto;
    }

    @Override
    public Persona getOwnerDeJure() {
	return this.ownerDeJure;
    }

    @Override
    public void setOwnerDeFacto(Persona persona) {
	this.ownerDeFacto = persona;	
    }

    @Override
    public Feod getParentFeod() {
	return this.parentFeod;
    }

}
