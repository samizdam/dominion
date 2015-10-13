package dominion.models.feod;

import java.util.ArrayList;
import java.util.List;

import dominion.models.Profit;
import dominion.models.persona.Persona;
import dominion.models.persona.UnknownPersona;
import dominion.models.title.Title;

public class BasicFeod extends AbstractFeod {

    BasicFeod(FeodName name) {
	super(name);
    }
    
    private Profit profit;
    private List<Feod> subDomains = new ArrayList<Feod>();
    private Title title;
    private Feod parentFeod;
    private Persona ownerDeFacto = new UnknownPersona();
    private Persona ownerDeJure;

    @Override
    public void addSubDomain(Feod domain) throws Exception {
	throw new Exception();

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
