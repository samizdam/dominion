package dominion;

import dominion.app.Application;
import dominion.app.Configuration;
import dominion.app.ConfigurationFactory;

public class Main {

    public static void main(String[] args) {
	Main self = new Main();
	
	Configuration config = self.initConfiguration(args);
	
	Application app = new Application(config);

	Thread thread = new Thread(app, "Dominion App");
	thread.run();

	System.out.println("Main is stop. ");

    }

    private Configuration initConfiguration(String[] args) {
	ConfigurationFactory factory = new ConfigurationFactory();
	Configuration config = factory.fromStringArgs(args);
	return config;
    }

}
