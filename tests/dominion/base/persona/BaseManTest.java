package dominion.base.persona;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import dominion.base.characteristic.LimitedCharacteristicValue;
import dominion.base.culture.BaseCulture;
import dominion.base.persona.name.BasePersonaName;
import dominion.models.characteristic.CharacteristicValue;
import dominion.models.persona.Gender;
import dominion.models.persona.Man;
import dominion.models.persona.Persona;
import dominion.models.persona.PersonaCharacteristic;
import dominion.models.persona.PersonaCharacteristicMap;
import dominion.models.persona.PersonaFactory;
import dominion.models.persona.PersonaModifier;
import dominion.models.persona.Woman;
import dominion.models.persona.name.PersonaFullName;
import junit.framework.TestCase;

public class BaseManTest extends TestCase {

    private PersonaFactory personaFactory = new BasePersonaFactory(new BaseCulture());

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
	Man father = mock(BaseMan.class);
	Woman mother = mock(BaseWoman.class);
	PersonaFullName fatherName = this.getBaseStubName();
	when(father.getName()).thenReturn(fatherName);
	Man man = this.createMan(father, mother);
	assertNotNull(man.getName());
    }

    public void testGetMother() {
	Man father = mock(BaseMan.class);
	BaseWoman mother = mock(BaseWoman.class);
	when(father.getName()).thenReturn(this.getBaseStubName());
	Man man = this.createMan(father, mother);
	assertEquals(mother, man.getMother());
    }

    public void testGetOwnedFeodsDeFacto() {
	Man man = this.createMan();
	assertEquals(0, man.getOwnedFeodsDeFacto().size());
    }

    public void testGetCharacteristics() {
	Man man = this.createMan();
	assertTrue(man.getCharacteristics() instanceof PersonaCharacteristicMap);
    }

    public void testAddModifier() {
	Man man = this.createMan();
	PersonaCharacteristic character = mock(PersonaCharacteristic.class);
	CharacteristicValue backupZeroCharValue = man.getCharacteristics().get(character);

	PersonaModifier mod = new BaseModifier("Ugly man");
	mod.put(character, new LimitedCharacteristicValue(character, 1));
	man.addModifier(mod);

	CharacteristicValue actualValue = man.getCharacteristics().get(character);

	assertTrue(backupZeroCharValue.toInt() < actualValue.toInt());
    }

    public void testGetState(){
	Man man = this.createMan();
	assertNotNull(man.getState());
    }
    
    private Man createMan() {
	BaseMan father = mock(BaseMan.class);
	when(father.getName()).thenReturn(this.getBaseStubName());
	return this.createMan(father, mock(BaseWoman.class));
    }

    private Man createMan(Man father, Woman mother) {
	return this.personaFactory.createMan(father, mother);
    }

    private PersonaFullName getBaseStubName() {
	return new BasePersonaName("Иван", "Иванов");
    }

}
