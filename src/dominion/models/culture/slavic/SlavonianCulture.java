package dominion.models.culture.slavic;

import dominion.base.land.BaseDemosGenerator;
import dominion.base.land.BaseLandNameGenerator;
import dominion.base.persona.BasePersonaCharacteristicGenerator;
import dominion.models.culture.Culture;
import dominion.models.land.DemosGenerator;
import dominion.models.land.LandNameGenerator;
import dominion.models.persona.CharacteristicGenerator;
import dominion.models.persona.name.PersonaNameGenerator;

public class SlavonianCulture implements Culture {

    private PersonaNameGenerator nameGenerator = new RandomSlavicStrategy();
    private CharacteristicGenerator personaCharacteristicGenerator = new BasePersonaCharacteristicGenerator();
    private LandNameGenerator landNameGenerator = new BaseLandNameGenerator(new HardcodedSlavicLandNameRepository());
    private DemosGenerator demosGenerator = new BaseDemosGenerator();

    @Override
    public PersonaNameGenerator getPersonaNameGenerator() {
	return this.nameGenerator ;
    }

    @Override
    public CharacteristicGenerator getPersonaCharacteristicGenerator() {
	return this.personaCharacteristicGenerator ;
    }

    @Override
    public LandNameGenerator getLandNameGenerator() {
	return this.landNameGenerator;
    }

    @Override
    public DemosGenerator getDemosGenerator() {
	return this.demosGenerator;
    }

}
