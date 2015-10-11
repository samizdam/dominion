package dominion.models.culture.slavic;

import junit.framework.TestCase;

public class SlavicTreePartNameTest extends TestCase {
    public void testGetPatronym(){
	SlavicTreePartName name = new SlavicTreePartName("Андрей", "Андреевич", "Андреев");
	assertEquals("Андреевич", name.getPatronym().toString());
    }
}
