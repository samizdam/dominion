package dominion.models.culture.slavic;

import dominion.models.persona.name.FamilyName;
import dominion.models.persona.name.FirstName;
import dominion.models.persona.name.Patronym;
import dominion.models.persona.name.PersonaName;

public class SlavicTreePartName implements PersonaName {
    
    private FirstName firstName;
    private Patronym patronym;
    private FamilyName familyName;

    public SlavicTreePartName(FirstName firstName, Patronym patronym, FamilyName familyName)
    {
	this.firstName = firstName;
	this.patronym = patronym;
	this.familyName = familyName;
    }
    
    public SlavicTreePartName(String firstName, String patronym, String familyName) {
	this(new FirstName(firstName), new Patronym(patronym), new FamilyName(familyName));
    }

    public FirstName getFirstName(){
	return this.firstName;
    }
    
    public Patronym getPatronym(){
	return this.patronym;
    }
    
    public FamilyName getFamilyName(){
	return this.familyName;
    }
    
}
