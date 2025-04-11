package busres;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String passenger;
    int busNo;
    Date date;

    Booking(Scanner sc) {  // Accept Scanner object from main method
        System.out.print("Enter name of passenger: ");
        sc.nextLine(); // Consume newline left by nextInt() in previous inputs
        passenger = sc.nextLine();

        System.out.print("Enter bus number: ");
        busNo = sc.nextInt();

        System.out.print("Enter date (dd-MM-yyyy): ");
        String dateInput = sc.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);

        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use dd-MM-yyyy.");
            return;
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;

        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
                break;
            }
        }

        int booked = 0;
        for (Booking b : bookings) {
            if (b.busNo == busNo && b.date.compareTo(date) == 0) {
                booked++;
            }
        }

        return booked < capacity;
    }
}
