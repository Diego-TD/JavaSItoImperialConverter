import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // unit converter
        int election;
        double userUnit, result;
        Scanner scan = new Scanner(System.in);

        System.out.println("Type a number to choose and option: \n\n"
                + "1: Convert Meter to Yard\n"
                + "2: Convert Yard to Meter\n"
                + "3: Convert Kilogram to pound\n"
                + "4: Convert Pound to Kilogram\n"
                + "5: Convert km/h to mi/h\n"
                + "6: Convert mi/h to km/h\n"
                + "7: Convert °C to °F\n"
                + "8: Convert °F to °C\n");
        election = scan.nextInt(); // how can I force it to only receive int values?

        switch (election) {
            case 1 -> {
                System.out.println("Meter to Yard \n" + "Introduce the amount to convert: ");
                userUnit = scan.nextDouble();
                result = userUnit * 1.0936132983;
                System.out.println(result + " yd");
            }
            case 2 -> {
                System.out.println("Yard to Meter \n" + "Introduce the amount to convert: ");
                userUnit = scan.nextDouble();
                result = userUnit / 1.0936132983;
                System.out.println(result + " m");
            }
            case 3 -> {
                System.out.println("Kilogram to pound\n" + "Introduce the amount to convert: ");
                userUnit = scan.nextDouble();
                result = userUnit * 2.2046226218;
                System.out.println(result + " lbs");
            }
            case 4 -> {
                System.out.println("Pound to Kilogram\n" + "Introduce the amount to convert: ");
                userUnit = scan.nextDouble();
                result = userUnit / 2.2046226218;
                System.out.println(result + " kg");
            }
            case 5 -> {
                System.out.println("km/h to mi/h\n" + "Introduce the amount to convert: ");
                userUnit = scan.nextDouble();
                result = userUnit / 1.609;
                System.out.println(result + " mi/h");
            }
            case 6 -> {
                System.out.println("mi/h to km/h\n" + "Introduce the amount to convert: ");
                userUnit = scan.nextDouble();
                result = userUnit * 1.609;
                System.out.println(result + " km/h");
            }
            case 7 -> {
                System.out.println("°C to °F\n" + "Introduce the amount to convert: ");
                userUnit = scan.nextDouble();
                result = (userUnit*9/5+32);
                System.out.println(result + " °F");
            }
            case 8 -> {
                System.out.println("°F to °C\n" + "Introduce the amount to convert: ");
                userUnit = scan.nextDouble();
                result = (userUnit-32)*5/9;
                System.out.println(result + " °C");
            }
            default -> System.out.println("what?");
        }
    }
} // Diego Torres Durante e014021
