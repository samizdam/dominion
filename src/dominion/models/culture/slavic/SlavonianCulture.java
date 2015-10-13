package dominion.models.culture.slavic;

import dominion.models.culture.Culture;
import dominion.models.persona.CharacteristicGenerator;
import dominion.models.persona.name.PersonaNameGenerator;

public class SlavonianCulture implements Culture {

    private PersonaNameGenerator nameGenerator = new RandomSlavicStrategy();
    private CharacteristicGenerator personaCharacteristicGenerator = new DefaultPersonaCharacteristicGenerator();

    @Override
    public PersonaNameGenerator getPersonaNameGenerator() {
	return this.nameGenerator ;
    }

    @Override
    public CharacteristicGenerator getPersonaCharacteristicGenerator() {
	return this.personaCharacteristicGenerator ;
    }

}
