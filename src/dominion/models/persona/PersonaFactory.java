package dominion.models.persona;

import dominion.models.culture.Culture;
import dominion.models.persona.name.PersonaNameGenerator;

public class PersonaFactory {
    
    private PersonaNameGenerator nameGenerator;
    private CharacteristicGenerator characteristicGenerator;
    
    public PersonaFactory(Culture culture) {
	this.setNameGenerator(culture.getPersonaNameGenerator());
	this.setCharacteristicGenerator(culture.getPersonaCharacteristicGenerator());
    }

    public void setNameGenerator(PersonaNameGenerator nameGenerator){
	this.nameGenerator = nameGenerator;
    }
    
    public void setCharacteristicGenerator(CharacteristicGenerator characteristicGenerator){
	this.characteristicGenerator = characteristicGenerator;
    }
    
    public Man createMan(Man father, Woman mother){
	Man man = new Man(father, mother);
	man.setName(this.nameGenerator.generateName(man));
	man.setCharacteristics(this.characteristicGenerator.generateCollection(man));
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
