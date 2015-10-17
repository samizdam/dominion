package dominion.base.persona;

import dominion.base.PastDate;
import dominion.models.culture.Culture;
import dominion.models.persona.CharacteristicGenerator;
import dominion.models.persona.Man;
import dominion.models.persona.PersonaFactory;
import dominion.models.persona.Woman;
import dominion.models.persona.name.PersonaNameGenerator;

public class BasePersonaFactory implements PersonaFactory {
    
    private Culture culture;
    
    private PersonaNameGenerator nameGenerator;
    private CharacteristicGenerator characteristicGenerator;
    
    
    public BasePersonaFactory(Culture culture) {
	this.culture = culture;
	this.setNameGenerator(culture.getPersonaNameGenerator());
	this.setCharacteristicGenerator(culture.getPersonaCharacteristicGenerator());	
    }

    /* (non-Javadoc)
     * @see dominion.base.persona.PersonaFactory#setNameGenerator(dominion.models.persona.name.PersonaNameGenerator)
     */
    @Override
    public void setNameGenerator(PersonaNameGenerator nameGenerator){
	this.nameGenerator = nameGenerator;
    }
    
    /* (non-Javadoc)
     * @see dominion.base.persona.PersonaFactory#setCharacteristicGenerator(dominion.models.persona.CharacteristicGenerator)
     */
    @Override
    public void setCharacteristicGenerator(CharacteristicGenerator characteristicGenerator){
	this.characteristicGenerator = characteristicGenerator;
    }
    
    /* (non-Javadoc)
     * @see dominion.base.persona.PersonaFactory#createMan(dominion.base.persona.Man, dominion.base.persona.Woman)
     */
    @Override
    public Man createMan(Man father, Woman mother){
	BaseMan man = new BaseMan(father, mother, new PastDate());
	man.setName(this.nameGenerator.generateName(man));
	man.setCharacteristics(this.characteristicGenerator.generateCollection(man));
	return man;
    }
    
    /* (non-Javadoc)
     * @see dominion.base.persona.PersonaFactory#createWoman(dominion.base.persona.Man, dominion.base.persona.Woman)
     */
    @Override
    public Woman createWoman(Man father, Woman mother){
	BaseWoman woman = new BaseWoman(father, mother, new PastDate()); 
	woman.setCulture(this.culture);
	return woman;
    }
    
    /* (non-Javadoc)
     * @see dominion.base.persona.PersonaFactory#createUnknowPersona()
     */
    @Override
    public UnknownPersona createUnknowPersona(){
	return new UnknownPersona();
    }
    
}
