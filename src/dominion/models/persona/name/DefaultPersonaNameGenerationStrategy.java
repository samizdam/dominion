package dominion.models.persona.name;

import dominion.models.culture.slavic.RandomSlavicStrategy;

public class DefaultPersonaNameGenerationStrategy implements PersonaNameGenerationStrategyFactory {

    private PersonaNameGenerationStrategy strategy = new RandomSlavicStrategy(); 
    @Override
    public PersonaNameGenerationStrategy getSrategy() {
	return this.strategy;
    }


}
