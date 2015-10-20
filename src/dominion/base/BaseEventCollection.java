package dominion.base;

import java.util.PriorityQueue;

import dominion.base.land.BaseLandModifierAppliedEvent;
import dominion.models.event.Event;
import dominion.models.event.EventsCollection;

public class BaseEventCollection extends PriorityQueue<Event> implements EventsCollection {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Create collection with single event.
     * @param landModifierApplied
     */
    public BaseEventCollection(BaseLandModifierAppliedEvent landModifierApplied) {
	this.add(landModifierApplied);
    }


}
