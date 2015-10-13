package dominion.models.persona.name;

public class UnknownPersonaName implements PersonaName {

    private FirstName firstName = new FirstName("unknown");
    private FamilyName familyName = new FamilyName("unknown");
    
    @Override
    public FirstName getFirstName() {
	return this.firstName;
    }

    @Override
    public FamilyName getFamilyName() {
	return this.familyName ;
    }


}
