// Purpose: test the Time class by creating two Time objects and advancing one by one second and decrementing the other by one second.
// Author: Nicholas Power
// Date: Jan, 30, 2025

public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Display initial times
        System.out.println("Initial Times:");
        System.out.println("Time 1: " + t1.toString());
        System.out.println("Time 2: " + t2.toString());

        // Advance t1 by one second and decrement t2 by one second
        t1.nextSecond();
        t2.previousSecond();

        // Display updated times
        System.out.println("\nUpdated Times:");
        System.out.println("Time 1: " + t1.toString());
        System.out.println("Time 2: " + t2.toString());
    }
}
