package dominion.app;

public class Application implements Runnable {

    private Configuration config;
    
    public Application(Configuration config) {
	this.config = config;
    }

    @Override
    public void run() {
	System.out.println("Main is run. ");
	System.out.println("Config is: " + this.config);
	
	
    }

}
