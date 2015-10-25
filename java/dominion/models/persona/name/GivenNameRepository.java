package dominion.models.persona.name;

import dominion.models.Repository;
import dominion.models.persona.Gender;

public interface GivenNameRepository extends Repository{
    public String getRandomStringForName(Gender gender);
}