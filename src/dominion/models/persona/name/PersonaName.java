package dominion.models.persona.name;

import dominion.base.persona.name.FamilyName;
import dominion.base.persona.name.FirstName;
import dominion.models.Name;

public interface PersonaName extends Name{
    public FirstName getFirstName();

    public FamilyName getFamilyName();
}
