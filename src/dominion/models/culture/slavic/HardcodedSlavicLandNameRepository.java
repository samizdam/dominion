package dominion.models.culture.slavic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import dominion.base.land.RegularLandName;
import dominion.models.land.LandName;

public class HardcodedSlavicLandNameRepository implements LandNameRepository {

    String names[] = {
	    "Славутич",
	    "Ладога",
	    "Лукоморье",
	    "Полесье",
	    "Приозерск"
    };
    private List<String> list = new ArrayList<String> (Arrays.asList(names));
    @Override
    public LandName getRangomName() {
	Collections.shuffle(this.list);
	return new RegularLandName(this.list.get(1));
    }

}