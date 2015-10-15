package dominion.base.persona;

import dominion.base.PastDate;
import dominion.models.culture.Culture;
import dominion.models.persona.CharacteristicGenerator;
import dominion.models.persona.name.PersonaNameGenerator;

public class PersonaFactory {
    
    private Culture culture;
    
    private PersonaNameGenerator nameGenerator;
    private CharacteristicGenerator characteristicGenerator;
    
    
    public PersonaFactory(Culture culture) {
	this.culture = culture;
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
	Man man = new Man(father, mother, new PastDate());
	man.setName(this.nameGenerator.generateName(man));
	man.setCharacteristics(this.characteristicGenerator.generateCollection(man));
	return man;
    }
    
    public Woman createWoman(Man father, Woman mother){
	Woman woman = new Woman(father, mother, new PastDate()); 
	woman.setCulture(this.culture);
	return woman;
    }
    
    public UnknownPersona createUnknowPersona(){
	return new UnknownPersona();
    }
    
}
