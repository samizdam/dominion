package dominion.models.persona.name;

import dominion.base.persona.name.BaseFirstName;
import dominion.models.Name;

public interface PersonaFullName extends Name{
    public BaseFirstName getFirstName();

    public FamilyName getFamilyName();
}
