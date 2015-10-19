package dominion.models.persona.name;

import dominion.models.Repository;
import dominion.models.persona.Gender;

public interface FirstNameRepository extends Repository{
    public String getRandomStringForName(Gender gender);
}