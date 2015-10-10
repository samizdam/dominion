package dominion.models.persona.name;

public class SlavicTreePartName implements PersonaName {
    
    private FirstName firstName;
    private Patronym patronymic;
    private FamilyName familyName;

    public SlavicTreePartName(FirstName firstName, Patronym patronymic, FamilyName familyName)
    {
	this.firstName = firstName;
	this.patronymic = patronymic;
	this.familyName = familyName;
    }
    
    public FirstName getFirstName(){
	return this.firstName;
    }
    
    public Patronym getPatronymic(){
	return this.patronymic;
    }
    
    public FamilyName getFamilyName(){
	return this.familyName;
    }
    
}
