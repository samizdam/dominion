package dominion.models.persona.name;

public class DefaultPersonaNameGenerationStrategy implements PersonaNameGenerationStrategyFactory {

    private PersonaNameGenerationStrategy strategy = new RandomSlavicStrategy(); 
    @Override
    public PersonaNameGenerationStrategy getSrategy() {
	return this.strategy;
    }


}
