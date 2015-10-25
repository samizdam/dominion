package dominion.models.persona;

import java.util.Collection;

import dominion.models.Date;
import dominion.models.culture.Culture;
import dominion.models.feod.Feod;
import dominion.models.persona.event.PersonaModifierAddedEvent;
import dominion.models.persona.name.PersonaFullName;
import dominion.models.title.Title;

public interface WellBornPersona extends Persona {
    public void setName(PersonaFullName name);
    
    public Collection<Title> getTitles();

    public Collection<Feod> getOwnedFeodsDeFacto();

    public Date getDateOfBirth();

    public Date getDateOfDeath();

    public PersonaModifierAddedEvent addModifier(PersonaModifier mod);

    public void setCharacteristics(PersonaCharacteristicMap characteristics);

    public PersonaCharacteristicMap getCharacteristics();

    public boolean isMarried();

    public void setSpouse(Persona persona);

    public Persona getSpouse();

    public Gender getGender();

    public void setCulture(Culture culture);

    public Culture getCulture();

    public Man getFather();

    public Woman getMother();
}
