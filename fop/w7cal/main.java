package fop.w7cal;

public class main {

    public static void main(String[] args){
        Event event1 = new Event(13, "Event", "Place");
        InfiniteRepeatEvent event2 = new InfiniteRepeatEvent(10, "InfiniteRepeatEvent", "Place", 5);
        RepeatEvent event3 = new RepeatEvent(9, "RepeatEvent", "Place", 5 , 24);

        Calendar calendar = new Calendar();

        calendar.addNewEvent(event1);
        calendar.addNewEvent(event2);
        calendar.addNewEvent(event3);

        Event[] events = calendar.eventsAt(20);
        System.out.println(events.length);
        for (int i = 0; i < events.length; i++){
            System.out.println(events[i].getDescription());
        }
        Event closestEvent = calendar.nextEvent(10);
        System.out.println(closestEvent.getDescription());
    }
}
