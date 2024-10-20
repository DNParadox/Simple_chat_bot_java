import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter temperature in Celsius
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = celsius * 1.8 + 32;

        // Display the result
        System.out.println(fahrenheit);

        // Close the scanner
        scanner.close();
    }
}
