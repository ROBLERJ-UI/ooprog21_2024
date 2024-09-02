import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
       
        System.out.println("**************************************");
        System.out.println("* Carly's makes the food that makes *");
        System.out.println("*             it a party.            *");
        System.out.println("* *********************************** *");

       
        double pricePerGuest = 35;

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of guests: ");
        int numGuests = scanner.nextInt();

       
        double totalPrice = numGuests * pricePerGuest;

       
        boolean isLargeEvent = numGuests >= 50;

        
        
        System.out.println("\n");
        System.out.println("Number of guests: " + numGuests);
        System.out.println("Price per guest: $" + pricePerGuest);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Large event: " + isLargeEvent);
    }
}