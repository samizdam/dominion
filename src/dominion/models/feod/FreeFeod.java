package dominion.models.feod;

import java.util.List;

import dominion.models.Profit;
import dominion.models.land.Land;
import dominion.models.persona.Persona;
import dominion.models.title.Title;

public class FreeFeod extends AbstractFeod{

    public FreeFeod(Land land) {
	super(land);
    }

    @Override
    public Title getTitle() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void addSubDomain(Feod domain) throws Exception {
	// TODO Auto-generated method stub
	
    }

    @Override
    public List<Feod> getSubDomains() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Profit getProfit() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public boolean hasSubDomains() {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isSovereign() {
	return true;
    }

    @Override
    public void setParentFeod(Feod feod) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public Feod getParentFeod() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Persona getOwnerDeFacto() {
	return null;
    }

    @Override
    public Persona getOwnerDeJure() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setOwnerDeFacto(Persona persona) {
	// TODO Auto-generated method stub
	
    }

}
