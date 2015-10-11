package dominion.models.persona;

import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

import dominion.models.Date;
import dominion.models.culture.Culture;
import dominion.models.feod.Feod;
import dominion.models.persona.name.DefaultPersonaNameGenerationStrategy;
import dominion.models.persona.name.PersonaName;
import dominion.models.persona.name.PersonaNameGenerationStrategyFactory;
import dominion.models.title.Title;

public abstract class AbstractPersona implements WellBornPersona {
    private Persona spouse;
    private Culture culture;
    private PersonaCharacteristicCollection<PersonaCharacteristic> characteristics;
    private List<PersonaModifier> mods;
    private Date dateOfDeath;
    private Date dateOfBirth;
    private Collection<Title> titles = new PriorityQueue<Title>();
    private Collection<Feod> feods = new PriorityQueue<Feod>();
    private PersonaName name;
    private Man father;
    private Woman mother;
    protected Gender gender;

    protected AbstractPersona(Man father, Woman mother, Date dateOfBirth){
	this.father = father;
	this.mother = mother;
	this.dateOfBirth = dateOfBirth;
    }

    @Override
    public Gender getGender() {
	return this.gender;
    }
    
    
    @Override
    public PersonaName getName() {
	if(this.name == null){
	    PersonaNameGenerationStrategyFactory factory = new DefaultPersonaNameGenerationStrategy();
	    this.name = factory.getSrategy().generateName(this);
	}
	return this.name;
    }

    @Override
    public Collection<Title> getTitles() {
	return this.titles;
    }

    @Override
    public Collection<Feod> getOwnedFeodsDeFacto() {
	return this.feods;
    }

    @Override
    public Date getDateOfBirth() {
	return this.dateOfBirth;
    }

    @Override
    public Date getDateOfDeath() {
	return this.dateOfDeath;
    }

    @Override
    public void addModifier(PersonaModifier mod) {
	this.mods.add(mod);
    }

    public void setCharacteristics(PersonaCharacteristicCollection<PersonaCharacteristic> characteristics) {
	this.characteristics = characteristics;
    }
    @Override
    public PersonaCharacteristicCollection<PersonaCharacteristic> getCharacteristics() {
	return this.characteristics;
    }

    @Override
    public boolean isMarried() {
	return this.spouse != null;
    }

    @Override
    public void setSpouse(Persona persona) {
	this.spouse = persona;
    }

    @Override
    public Persona getSpouse() {
	return this.spouse;
    }

    @Override
    public Culture getCulture() {
	return this.culture;
    }

    public Man getFather(){
	return this.father;
    }

    public Woman getMother() {
	return this.mother;
    }
    
    public void setName(PersonaName name) {
	this.name = name;	
    }

}
