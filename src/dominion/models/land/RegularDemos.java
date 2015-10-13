package dominion.models.land;

public class RegularDemos implements Demos {

    private int mans = 0;
    private int womans = 0;

    public void setNumberOfMans(int num){
	this.mans = num;
    }
    
    public void setNumberOfWoman(int num){
	this.womans = num;
    }
    
    @Override
    public int count() {
	return this.getNumberOfMans() + getNumberOfWomans();
    }

    @Override
    public int getNumberOfMans() {
	return this.mans;
    }

    @Override
    public int getNumberOfWomans() {
	return this.womans;
    }
    

}
