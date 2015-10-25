package dominion.base.feod;

import java.util.ArrayList;
import java.util.List;

import dominion.models.Name;
import dominion.models.culture.Culture;
import dominion.models.feod.CulturesCollection;
import dominion.models.feod.Feod;
import dominion.models.feod.FeodName;
import dominion.models.land.Land;

abstract class AbstractFeod implements Feod{

    private Name name;
    private List<Land> lands = new ArrayList<Land>();
    private CulturesCollection culturesCollection;
    
    AbstractFeod(FeodName name){
        this.name = name;
    }
    
    AbstractFeod(Land land){
	this.addLand(land);
    }

    @Override
    public Name getName() {
	return this.name;
    }
    
    @Override
    public void addLand(Land land) {
	this.lands.add(land);
    }

    @Override
    public List<Land> getLangs() {
	return this.lands;
    }
    
    @Override
    public Culture getDominantCulture() {
	return this.culturesCollection.peek();
    }
}
