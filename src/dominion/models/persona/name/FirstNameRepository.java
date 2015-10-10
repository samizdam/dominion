package dominion.models.persona.name;

import dominion.models.persona.Gender;

public interface FirstNameRepository {
    public String getRandomStringForName(Gender gender);
}