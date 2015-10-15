package dominion.base.land;

import dominion.base.land.resource.BaseResourceMap;
import dominion.models.culture.Culture;
import dominion.models.event.EventsCollection;
import dominion.models.feod.Feod;
import dominion.models.land.Demos;
import dominion.models.land.Land;
import dominion.models.land.LandModifier;
import dominion.models.land.LandName;
import dominion.models.land.LandProfit;
import dominion.models.land.resource.Resource;
import dominion.models.land.resource.ResourceMap;
import dominion.models.land.resource.ResourceType;

public class BaseLand implements Land{

    private LandName name;
    private Feod domain;
    private Demos demos;
    private LandProfit profit = new BaseProfit(this);
    private ResourceMap resourceMap = new BaseResourceMap();

    BaseLand(LandName name, Demos demos){
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