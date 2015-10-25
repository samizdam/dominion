package dominion.base.persona;

import dominion.Registry;
import dominion.models.Date;
import dominion.models.persona.Man;
import dominion.models.persona.Persona;
import dominion.models.persona.PersonaService;
import dominion.models.persona.Woman;

public class BasePersonaService implements PersonaService {

    @Override
    public Man createMan(Man father, Woman mother) {
	Date dateOfBirth = Registry.getInstance().getCurrentDate();
	return new BaseMan(father, mother, dateOfBirth);
    }

    @Override
    public Woman createWoman(Man father, Woman mother) {
	Date dateOfBirth = Registry.getInstance().getCurrentDate();
	return new BaseWoman(father, mother, dateOfBirth);
    }

    @Override
    public Persona createUnknownPersona() {
	return new BaseUnknownPersona();
    }

}
