package dominion.models.feod;

import java.util.List;

import dominion.models.Name;
import dominion.models.Profit;
import dominion.models.Title;
import dominion.models.culture.Culture;
import dominion.models.land.Land;
import dominion.models.persona.Persona;

public class BasicFeod implements Feod {

    private List<Land> land;
    private Profit profit;
    private List<Feod> subDomains;
    private Name name;
    private Title title;
    private Feod parentFeod;
    private Persona ownerDeFacto;
    private Persona ownerDeJure;
    private CulturesCollection culturesCollection;

    public BasicFeod(FeodName name){
	this.name = name;
    }
    
    @Override
    public Name getName() {
	return this.name;
    }

    @Override
    public void addSubDomain(Feod domain) throws Exception {
	throw new Exception();

    }

    @Override
    public List<Feod> getSubDomains() {
	return this.subDomains;
    }

    @Override
    public void addLand(Land land) {
	this.land.add(land);
    }

    @Override
    public List<Land> getLangs() {
	return this.land;
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
	return this.parentFeod.equals(null);
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
    public Culture getDominantCulture() {
	return this.culturesCollection.peek();
    }

}
