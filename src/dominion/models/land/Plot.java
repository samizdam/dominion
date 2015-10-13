package dominion.models.land;

import dominion.models.culture.Culture;
import dominion.models.feod.Feod;

public class Plot implements Land{

    private LandName name;
    private Feod domain;
    private Demos demos;

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
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void addModifier(LandModifier mod) {
	// TODO Auto-generated method stub
	
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

}
