package dominion.base.persona.name;

import dominion.models.persona.name.PersonaNameGenerationStrategyFactory;
import dominion.models.persona.name.PersonaNameGenerator;

public class BasePersonaNameGenerationStrategy implements PersonaNameGenerationStrategyFactory {

    /**
     * Replace with some default implementation. 
     */
    private PersonaNameGenerator strategy;
    
    public BasePersonaNameGenerationStrategy(PersonaNameGenerator generator) {
	this.strategy = generator;
    }
    @Override
    public PersonaNameGenerator getSrategy() {
	return this.strategy;
    }


}
