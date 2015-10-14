package dominion.models;

import java.util.PriorityQueue;

import dominion.models.events.Event;
import dominion.models.events.EventsCollection;
import dominion.models.land.LandModifierApplied;

public class BaseEventCollection extends PriorityQueue<Event> implements EventsCollection {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Create collection with single event.
     * @param landModifierApplied
     */
    public BaseEventCollection(LandModifierApplied landModifierApplied) {
	this.add(landModifierApplied);
    }


}
