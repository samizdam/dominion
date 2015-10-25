package dominion.models.persona;

import dominion.models.Generator;

public interface CharacteristicGenerator extends Generator{

    PersonaCharacteristicMap generateCollection(Man man);

}
