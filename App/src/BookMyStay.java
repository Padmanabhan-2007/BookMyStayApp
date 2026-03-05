abstract class Room {

    private String roomType;
    private int beds;
    private int size;
    private double price;

    public Room(String roomType, int beds, int size, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getBeds() {
        return beds;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void displayRoomDetails() {
        System.out.println("Room Type : " + roomType);
        System.out.println("Beds      : " + beds);
        System.out.println("Size      : " + size + " sq.ft");
        System.out.println("Price     : ₹" + price + " per night");
    }
}

/* Single Room Class */
class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 200, 2000);
    }
}

/* Double Room Class */
class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 350, 3500);
    }
}

/* Suite Room Class */
class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 600, 7000);
    }
}

/* Application Entry Point */
public class BookMyStay{

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("     Book My Stay App");
        System.out.println(" Hotel Booking Management System");
        System.out.println("           Version 2.1");
        System.out.println("====================================\n");

        // Create room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability variables
        int singleRoomAvailable = 5;
        int doubleRoomAvailable = 3;
        int suiteRoomAvailable = 2;

        // Display Single Room details
        singleRoom.displayRoomDetails();
        System.out.println("Available : " + singleRoomAvailable + "\n");

        // Display Double Room details
        doubleRoom.displayRoomDetails();
        System.out.println("Available : " + doubleRoomAvailable + "\n");

        // Display Suite Room details
        suiteRoom.displayRoomDetails();
        System.out.println("Available : " + suiteRoomAvailable + "\n");

        System.out.println("Thank you for exploring Book My Stay!");
    }
}