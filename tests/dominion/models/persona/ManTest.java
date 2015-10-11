package dominion.models.persona;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import dominion.models.culture.slavic.SlavicTreePartName;
import dominion.models.persona.name.FamilyName;
import dominion.models.persona.name.FirstName;
import dominion.models.persona.name.Patronym;
import dominion.models.persona.name.Woman;
import junit.framework.TestCase;

public class ManTest extends TestCase {

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

    private Man createMan() {
	return new Man(mock(Man.class), mock(Woman.class));
    }

    private Man createMan(Man father, Woman mother) {
	return new Man(father, mother);
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
