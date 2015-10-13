package dominion.models.persona.name;

import dominion.models.culture.slavic.RandomSlavicStrategy;

public class DefaultPersonaNameGenerationStrategy implements PersonaNameGenerationStrategyFactory {

    private PersonaNameGenerator strategy = new RandomSlavicStrategy(); 
    @Override
    public PersonaNameGenerator getSrategy() {
	return this.strategy;
    }


}
