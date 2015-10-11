package dominion.models.persona;

public interface CharacteristicGenerator {

    PersonaCharacteristicCollection<PersonaCharacteristic> generateCollection(Man man);

}
