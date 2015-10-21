package dominion.models.persona.name;

import dominion.models.Name;

public interface PersonaFullName extends Name{
    public FirstName getFirstName();

    public FamilyName getFamilyName();
}
