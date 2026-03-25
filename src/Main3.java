import java.util.ArrayList;

// i. Rectangle class
class Rectangle {

    // iv. Fields
    double length;
    double width;

    // ii. Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width  = width;
        System.out.println("Rectangle created: " + length + " x " + width);
    }

    // iii. Destructor
    @Override
    protected void finalize() {
        System.out.println("Rectangle destroyed.");
    }

    public void displayArea() {
        System.out.println("Area = " + (length * width));
    }
}

// b. Calculator class
class Calculator {

    public void displaySum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " = " + sum);
    }
}

// Main class
public class Main3 {
    public static void main(String[] args) {

        // --- a) Rectangle ---
        System.out.println("=== Rectangle ===");
        Rectangle rect = new Rectangle(10.0, 5.0);
        rect.displayArea();

        // --- b) Sum of two numbers ---
        System.out.println("\n=== Sum Function ===");
        Calculator calc = new Calculator();
        calc.displaySum(8, 12);

        // --- c) Array ---
        System.out.println("\n=== Array ===");
        int[] numbersArray = new int[5];
        numbersArray[0] = 10;
        numbersArray[1] = 20;
        numbersArray[2] = 30;
        numbersArray[3] = 40;
        numbersArray[4] = 50;

        for (int num : numbersArray) {
            System.out.println(num);
        }

        // --- c) ArrayList ---
        System.out.println("\n=== ArrayList ===");
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);

        for (int num : numbersList) {
            System.out.println(num);
        }

    }
}