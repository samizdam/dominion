package dominion.models.persona.name;

import dominion.models.Name;

public interface PersonaFullName extends Name{
    public FirstName getGivenName();

    public FamilyName getFamilyName();
}
