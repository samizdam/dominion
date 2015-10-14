package dominion.models.land;

import dominion.models.culture.Culture;
import dominion.models.events.EventsCollection;
import dominion.models.feod.Feod;
import dominion.models.land.resources.BaseResourceMap;
import dominion.models.land.resources.Resource;
import dominion.models.land.resources.ResourceMap;
import dominion.models.land.resources.ResourceType;

public class Plot implements Land{

    private LandName name;
    private Feod domain;
    private Demos demos;
    private LandProfit profit = new BaseProfit(this);
    private ResourceMap resourceMap = new BaseResourceMap();

    Plot(LandName name, Demos demos){
	this.name = name;
	this.demos = demos;
    }
    @Override
    public LandName getName() {
	return this.name;
    }

    @Override
    public void setDomain(Feod domain) {
	this.domain = domain;
	
    }

    @Override
    public Feod getDomain() {
	return this.domain;
    }

    @Override
    public LandProfit getProfit() {
	return this.profit ;
    }

    @Override
    public EventsCollection addModifier(LandModifier mod) {
	return mod.apply(this);	
    }

    @Override
    public Culture getDominantCulture() {
	// TODO Auto-generated method stub
	return null;
    }
    @Override
    public Demos getDemos() {
	return this.demos ;
    }
    @Override
    public Resource getResource(ResourceType type) {
	return this.resourceMap.get(type);
    }

}
