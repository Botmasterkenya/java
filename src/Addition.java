import java.util.Scanner;
public class Addition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number:");

        int firstNumber = sc.nextInt();
        System.out.print("Enter your second number:");
        int secondNumber = sc.nextInt();
        int total =firstNumber + secondNumber;

        System.out.println("Your totals are:" + total);
    }
}