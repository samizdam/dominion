package dominion.models.persona;

import java.util.List;

import dominion.models.Culture;
import dominion.models.Date;
import dominion.models.Title;
import dominion.models.feod.Feod;

public abstract class AbstractPersona implements Persona{
    private Persona spouse;
    private Culture culture;
    private List<Characteristic> characteristics;
    private List<PersonaModifier> mods;
    private Date dateOfDeath;
    private Date dateOfBirth;
    private List<Title> titles;
    private List<Feod> feods;
    private PersonaName name;
    private Gender gender;

    @Override
    public PersonaName getName() {
	return this.name;
    }

    @Override
    public List<Title> getTitles() {
	return this.titles;
    }

    @Override
    public List<Feod> getOwnedFeodsDeFacto() {
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

    @Override
    public List<Characteristic> getCharacteristics() {
	return this.characteristics;
    }

    @Override
    public boolean isMarried() {
	return this.spouse.equals(null);
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

}
