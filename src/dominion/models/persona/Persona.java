package dominion.models.persona;

import java.util.Collection;
import java.util.List;

import dominion.models.Date;
import dominion.models.Title;
import dominion.models.culture.Culture;
import dominion.models.feod.Feod;
import dominion.models.persona.name.PersonaName;

/**
 * 
 * @author samizdam
 *
 */
public interface Persona {
    
    
    public PersonaName getName();
    
    public Collection<Title> getTitles();
    
    public Collection<Feod> getOwnedFeodsDeFacto();
    
    public Date getDateOfBirth();
    
    public Date getDateOfDeath();
    
    public void addModifier(PersonaModifier mod);
    
    public List<Characteristic> getCharacteristics();
    
    public boolean isMarried();
    
    public void setSpouse(Persona persona);
    
    public Persona getSpouse();
    
    public Gender getGender();
    
    public Culture getCulture();
    
    public Persona getFather();
    
    public Persona getMother();
}
