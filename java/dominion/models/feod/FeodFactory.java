package dominion.models.feod;

import dominion.models.Factory;

public interface FeodFactory extends Factory {
    Feod createFeod(FeodName name);
}
