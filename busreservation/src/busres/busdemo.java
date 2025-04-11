package busres;

import java.util.ArrayList;
import java.util.Scanner;

public class busdemo {

    public static void main(String[] args) {

        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, false, 5));
        buses.add(new Bus(3, true, 8));

        for (Bus b : buses) {
            b.displayBusInfo();
        }

        Scanner sc = new Scanner(System.in); // Open Scanner in main

        int userOpt = 1;
        while (userOpt == 1) {
            System.out.println("Enter 1 to book and 2 to exit");
            userOpt = sc.nextInt();

            if (userOpt == 1) {
                Booking booking = new Booking(sc);  // Pass Scanner to Booking
                if (booking.isAvailable(bookings, buses)) {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed.");
                } else {
                    System.out.println("Sorry, the bus is full. Try another bus or date.");
                }
            }
        }

        sc.close(); // Close Scanner after all inputs are done
    }
}
