import java.util.Scanner;

public class TotalFees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter fee per student: ");
        double feePerStudent = sc.nextDouble();

        double totalFees = students * feePerStudent;

        System.out.println("Total fees collected: " + totalFees);
    }
}