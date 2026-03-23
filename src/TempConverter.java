import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        float fahrenheit = sc.nextFloat();

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.printf("Temperature in Celsius: %f°C%n", celsius);
    }
}