package dominion.models.culture.slavic;

import dominion.models.culture.Culture;
import dominion.models.persona.name.PersonaNameGenerator;

public class SlavonianCulture implements Culture {

    private PersonaNameGenerator nameGenerator = new RandomSlavicStrategy();

    @Override
    public PersonaNameGenerator getPersonaNameGenerator() {
	return this.nameGenerator ;
    }

}
