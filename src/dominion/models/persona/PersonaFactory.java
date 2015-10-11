package dominion.models.persona;

import dominion.models.persona.name.PersonaNameGenerationStrategyFactory;

public class PersonaFactory {
    
    private PersonaNameGenerationStrategyFactory generatorFactory;

    public PersonaFactory(PersonaNameGenerationStrategyFactory factory){
	this.setGeneratorFactory(factory);
    }
    
    public void setGeneratorFactory(PersonaNameGenerationStrategyFactory factory){
	this.generatorFactory = factory;
    }
    
    public Man createMan(Man father, Woman mother){
	Man man = new Man(father, mother);
	man.setName(this.generatorFactory.getSrategy().generateName(man));
	return man;
    }
    
    public Woman createWoman(Man father, Woman mother){
	Woman woman = new Woman(father, mother); 
	return woman;
    }
    
    public UnknowPersona createUnknowPersona(){
	return new UnknowPersona();
    }
    
}
