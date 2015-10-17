package dominion.models.persona;

import dominion.base.persona.UnknownPersona;
import dominion.models.Factory;
import dominion.models.persona.name.PersonaNameGenerator;

public interface PersonaFactory extends Factory {

    void setNameGenerator(PersonaNameGenerator nameGenerator);

    void setCharacteristicGenerator(CharacteristicGenerator characteristicGenerator);

    Man createMan(Man father, Woman mother);

    Woman createWoman(Man father, Woman mother);

    UnknownPersona createUnknowPersona();

}