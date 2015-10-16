package dominion.models.persona;

import dominion.base.persona.Man;
import dominion.base.persona.UnknownPersona;
import dominion.base.persona.BaseWoman;
import dominion.models.persona.name.PersonaNameGenerator;

public interface PersonaFactory {

    void setNameGenerator(PersonaNameGenerator nameGenerator);

    void setCharacteristicGenerator(CharacteristicGenerator characteristicGenerator);

    Man createMan(Man father, BaseWoman mother);

    Woman createWoman(Man father, BaseWoman mother);

    UnknownPersona createUnknowPersona();

}