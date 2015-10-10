package dominion.models.persona;

import java.util.List;

import dominion.models.Culture;
import dominion.models.Date;
import dominion.models.Title;
import dominion.models.feod.Feod;

/**
 * 
 * @author samizdam
 *
 */
public interface Persona {
    
    
    public PersonaName getName();
    
    public List<Title> getTitles();
    
    public List<Feod> getOwnedFeodsDeFacto();
    
    public Date getDateOfBirth();
    
    public Date getDateOfDeath();
    
    public void addModifier(PersonaModifier mod);
    
    public List<Characteristic> getCharacteristics();
    
    public boolean isMarried();
    
    public void setSpouse(Persona persona);
    
    public Persona getSpouse();
    
    public Gender getGender();
    
    public Culture getCulture();
}
