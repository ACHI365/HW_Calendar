package fop.w7cal;

public class Calendar {

    private EventList events;

    public Calendar(){
        events = null;
    }

    public void addNewEvent(Event event) {
        if (events == null) {
            events = new EventList(event);
        }else {
            events = events.add(event);
        }
    }

    public Event[] eventsAt(int day){
        if (events == null) return  new Event[0];

        int count = 0;

        EventList currEvent = events;
        while (currEvent != null) {
            if (currEvent.getEvent().diff(day) == 0) count++;

            currEvent = currEvent.getNext();
        }
        Event[] result = new Event[count];
        currEvent = events;
        int index =0;
        while (currEvent != null) {
            if (currEvent.getEvent().diff(day) == 0){
                result[index] = currEvent.getEvent();
                index ++;
            }

            currEvent = currEvent.getNext();
        }
        return result;
    }

    public Event nextEvent(int day) {
        if (events == null){
            return null;
        }

        Event closestEvent = null;
        int minDiff = Integer.MAX_VALUE;

        EventList currEvent = events;
        while (currEvent != null) {
            int currDiff = currEvent.getEvent().diff(day);
            if (currDiff >= 0 && currDiff < minDiff) {
                closestEvent = currEvent.getEvent();
                minDiff = currDiff;
            }

            currEvent = currEvent.getNext();
        }
        return closestEvent;
    }
}
