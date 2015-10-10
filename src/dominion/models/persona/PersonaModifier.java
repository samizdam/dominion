package dominion.models.persona;

import java.util.List;

import dominion.models.Modifier;

public interface PersonaModifier extends Modifier{
    public List<Characteristic> getCharacteristics();
}
