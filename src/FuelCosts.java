import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        double gas_tank_amount = 0.0;
        double fuel_efficiency = 0.0;
        double price_per_gal = 0.0;
        Scanner input = new Scanner(System.in);
        boolean done = false;
        do {
            System.out.println("How many gallons of gas can your gas tank hold");

            if (input.hasNextDouble()) {
                gas_tank_amount = input.nextDouble();
                done = true;
            } else {
                System.out.println("Wrong input type, re-input");
                input.nextLine();
            }
        } while (!done);
        done = false;
        do {
            System.out.println("What is your fuel efficiency in miles per gallon");

            if (input.hasNextDouble()) {
                fuel_efficiency = input.nextDouble();
                done = true;
            } else {
                System.out.println("Wrong input type, re-input");
                input.nextLine();
            }
        } while (!done);
        done = false;
        do {
            System.out.println("What is the price of gas per gallon");

            if (input.hasNextDouble()) {
                price_per_gal = input.nextDouble();
                done = true;
            } else {
                System.out.println("Wrong input type, re-input");
                input.nextLine();
            }
        } while (!done);
        double hund_miles = (100.0/fuel_efficiency)*price_per_gal;
        System.out.println("For you to travel 100 miles it would cost you: $"+hund_miles);
        double dis_travel = gas_tank_amount*fuel_efficiency;
        System.out.println("You would travel: "+ dis_travel+ " miles, given you had a full tank of gas");

    }
}

