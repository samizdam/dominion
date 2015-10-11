package dominion.models.persona;

import dominion.models.culture.Culture;
import dominion.models.persona.name.PersonaNameGenerator;

public class PersonaFactory {
    
    private PersonaNameGenerator nameGenerator;
    
    public PersonaFactory(Culture culture) {
	this.setNameGenerator(culture.getPersonaNameGenerator());
    }

    public void setNameGenerator(PersonaNameGenerator nameGenerator){
	this.nameGenerator = nameGenerator;
    }
    
    public Man createMan(Man father, Woman mother){
	Man man = new Man(father, mother);
	man.setName(this.nameGenerator.generateName(man));
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
