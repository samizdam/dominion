package dominion.base.culture;

import dominion.base.land.BaseDemosGenerator;
import dominion.base.land.BaseLandNameGenerator;
import dominion.base.persona.BasePersonaCharacteristicGenerator;
import dominion.models.culture.Culture;
import dominion.models.demos.DemosGenerator;
import dominion.models.land.LandNameGenerator;
import dominion.models.persona.CharacteristicGenerator;
import dominion.models.persona.name.PersonaNameGenerator;

public class BaseCulture implements Culture {

    @Override
    public PersonaNameGenerator getPersonaNameGenerator() {
	return new BasePersonaNameGenerator();
    }

    @Override
    public CharacteristicGenerator getPersonaCharacteristicGenerator() {
	return new BasePersonaCharacteristicGenerator();
    }

    @Override
    public LandNameGenerator getLandNameGenerator() {
	return new BaseLandNameGenerator(new BaseLandNameRepository());
    }

    @Override
    public DemosGenerator getDemosGenerator() {
	return new BaseDemosGenerator();
    }

}
