public class Voyage {
    private String flightNumber;
    // Unique alpha‐numeric identifier for the particular flight route
    private int delay;
    // Minutes late in arriving at destination
    private boolean rebelRelated;
    // Equals true if the voyage was disrupted by an attack from the rebel alliance,
    // otherwise false.
    // Constructor which initialises all 3 of the above data items
    public Voyage(String fn, int d, boolean rr) {
        flightNumber = fn;
        delay = d;
        rebelRelated = rr;
    }
    // All accessor and mutator methods provide
 }