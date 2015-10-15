package dominion.base.persona.name;

import dominion.models.culture.slavic.RandomSlavicStrategy;
import dominion.models.persona.name.PersonaNameGenerationStrategyFactory;
import dominion.models.persona.name.PersonaNameGenerator;

public class DefaultPersonaNameGenerationStrategy implements PersonaNameGenerationStrategyFactory {

    private PersonaNameGenerator strategy = new RandomSlavicStrategy(); 
    @Override
    public PersonaNameGenerator getSrategy() {
	return this.strategy;
    }


}
