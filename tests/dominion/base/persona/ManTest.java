package dominion.base.persona;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import dominion.base.characteristic.LimitedCharacteristicValue;
import dominion.base.persona.Man;
import dominion.base.persona.PersonaFactory;
import dominion.base.persona.Woman;
import dominion.base.persona.name.FamilyName;
import dominion.base.persona.name.FirstName;
import dominion.base.persona.name.Patronym;
import dominion.models.characteristic.CharacteristicValue;
import dominion.models.culture.slavic.SlavicTreePartName;
import dominion.models.culture.slavic.SlavonianCulture;
import dominion.models.persona.Gender;
import dominion.models.persona.Persona;
import dominion.models.persona.PersonaCharacteristic;
import dominion.models.persona.PersonaCharacteristicMap;
import dominion.models.persona.PersonaModifier;
import junit.framework.TestCase;

public class ManTest extends TestCase {

    private PersonaFactory personaFactory = new PersonaFactory(new SlavonianCulture());
    
    public void testGetGender() {
	Man man = this.createMan();
	assertEquals(Gender.male, man.getGender());
    }

    public void testSetSpouse() {
	Man man = this.createMan();
	Persona spouse = mock(Persona.class);
	man.setSpouse(spouse);
	assertTrue(man.isMarried());
    }

    public void testGetTitles() {
	Man man = this.createMan();
	assertTrue(man.getTitles().isEmpty());
    }

    public void testGetName() {
	Man father = mock(Man.class);
	Woman mother = mock(Woman.class);
	SlavicTreePartName fatherName = this.getSlavicStubName();
	when(father.getName()).thenReturn(fatherName);
	Man man = this.createMan(father, mother);
	assertNotNull(man.getName());
    }

    public void testGetMother(){
	Man father = mock(Man.class);
	Woman mother = mock(Woman.class);
	when(father.getName()).thenReturn(this.getSlavicStubName());
	Man man = this.createMan(father, mother);
	assertEquals(mother, man.getMother());
    }
    
    public void testGetOwnedFeodsDeFacto(){
	Man man = this.createMan();
	assertEquals(0, man.getOwnedFeodsDeFacto().size());
    }
    
    public void testGetCharacteristics(){
	Man man = this.createMan();
	assertTrue(man.getCharacteristics() instanceof PersonaCharacteristicMap);
    }
    
    public void testAddModifier(){
	Man man = this.createMan();
	PersonaCharacteristic character = mock(PersonaCharacteristic.class);
	CharacteristicValue backupZeroCharValue = man.getCharacteristics().get(character);
	
	PersonaModifier mod = new BaseModifier();
	mod.put(character, new LimitedCharacteristicValue(character, 1));
	man.addModifier(mod);
	
	CharacteristicValue actualValue = man.getCharacteristics().get(character);
	
	assertTrue(backupZeroCharValue.toInt() < actualValue.toInt());
    }
    
    private Man createMan() {
	Man father = mock(Man.class);
	when(father.getName()).thenReturn(this.getSlavicStubName());
	return this.createMan(father, mock(Woman.class));
    }

    private Man createMan(Man father, Woman mother) {
	return this.personaFactory.createMan(father, mother);
    }
    
    private SlavicTreePartName getSlavicStubName(){
	FirstName Ivan = new FirstName("Иван"); 
	return new SlavicTreePartName(
		Ivan,
		new Patronym(Ivan),
		new FamilyName("Иванов")
		); 
    }

}
