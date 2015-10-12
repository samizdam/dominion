package dominion.models.persona;

import java.util.ArrayList;
import java.util.Map.Entry;

import dominion.models.CharacteristicValue;
import dominion.models.characteristic.Characteristic;

public class PersonaModList extends ArrayList<PersonaModifier> {

    private WellBornPersona owner;
    
    public PersonaModList(WellBornPersona owner) {
	this.owner = owner;
    }
    
    public boolean add(PersonaModifier mod){
	for(Entry<Characteristic, CharacteristicValue> entry: mod.entrySet() ){
	    PersonaCharacteristicMap personaCharMap = this.owner.getCharacteristics(); 
	    
	    Characteristic character = entry.getKey();
	    
	    CharacteristicValue value = entry.getValue();
	    CharacteristicValue oldValue = this.owner.getCharacteristics().get(character);
	    CharacteristicValue newValue = value.merge(oldValue);
	    
	    personaCharMap.put(character, newValue);
	}
	return super.add(mod);
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1L;


}
