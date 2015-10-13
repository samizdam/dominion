package dominion.models.culture.slavic;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import dominion.models.persona.Gender;
import dominion.models.persona.name.FirstNameRepository;

public class HardcodedSlavicFirstNameRepository implements FirstNameRepository {

    private static Map<Integer, String> prefixDictionary = new HashMap<Integer, String>() {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	{
	    put(0, "Яро");
	    put(1, "Вече");
	}
    };
    private static Map<Integer, String> suffixxDictionary = new HashMap<Integer, String>() {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	{
	    put(0, "Слав");
	    put(1, "Бой");
	    put(2, "Гон");
	}
    };

    public String getRandomStringForName(Gender gender) {
	Random random = new Random();
	Integer maxPrefix = prefixDictionary.size();
	Integer maxSuffix = suffixxDictionary.size();
	Integer randomPrefixInt = random.nextInt(maxPrefix) - 1;
	Integer randomSuffixInt = random.nextInt(maxSuffix) - 1;
	return prefixDictionary.get(randomPrefixInt) + suffixxDictionary.get(randomSuffixInt);
    }

}
