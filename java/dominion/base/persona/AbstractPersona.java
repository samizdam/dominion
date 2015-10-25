package dominion.base.persona;

import java.util.Collection;
import java.util.PriorityQueue;

import dominion.base.persona.event.BasePersonaModifierAdded;
import dominion.base.persona.state.StateFactory;
import dominion.models.Date;
import dominion.models.culture.Culture;
import dominion.models.feod.Feod;
import dominion.models.persona.Gender;
import dominion.models.persona.Man;
import dominion.models.persona.Persona;
import dominion.models.persona.PersonaCharacteristicMap;
import dominion.models.persona.PersonaModifier;
import dominion.models.persona.State;
import dominion.models.persona.WellBornPersona;
import dominion.models.persona.Woman;
import dominion.models.persona.event.PersonaModifierAddedEvent;
import dominion.models.persona.name.PersonaFullName;
import dominion.models.title.Title;

abstract class AbstractPersona implements WellBornPersona {
    private Persona spouse;
    private Culture culture;
    private PersonaCharacteristicMap characteristics;
    private PersonaModList mods = new PersonaModList(this);
    private Date dateOfDeath;
    private Date dateOfBirth;
    private Collection<Title> titles = new PriorityQueue<Title>();
    private Collection<Feod> feods = new PriorityQueue<Feod>();
    private PersonaFullName name;
    private Man father;
    private Woman mother;
    protected Gender gender;
    private StateFactory stateFactory = new StateFactory(); 
    private State state = this.stateFactory.getState("live");

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
    public PersonaFullName getName() {
	if(this.name == null){
	    this.name = this.culture.getPersonaNameGenerator().generateName(this);
	}
	return this.name;
    }

    public dominion.models.persona.State getState() {
	return this.state;
    };
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
    public PersonaModifierAddedEvent addModifier(PersonaModifier mod) {
	this.mods.add(mod);
	return new BasePersonaModifierAdded(this, mod);
    }

    public void setCharacteristics(PersonaCharacteristicMap characteristics) {
	this.characteristics = characteristics;
    }
    @Override
    public PersonaCharacteristicMap getCharacteristics() {
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

    public void setCulture(Culture culture) {
	this.culture = culture;
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
    
    public void setName(PersonaFullName name) {
	this.name = name;	
    }

}
