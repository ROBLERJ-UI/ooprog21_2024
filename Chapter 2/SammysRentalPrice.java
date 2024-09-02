import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        
        int hourlyRate = 40;
        int perMinuteRate = 1;

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.print("Enter the rental time in minutes: ");
        int rentalTimeMinutes = scanner.nextInt();
        
        
        int hours = rentalTimeMinutes / 60;
        int remainingMinutes = rentalTimeMinutes % 60;
        int totalCost = hours * hourlyRate + remainingMinutes * perMinuteRate;
       
       
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + remainingMinutes);
        System.out.println("Total price: $" + totalCost);
    }
}