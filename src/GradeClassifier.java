import java.util.Scanner;
public class GradeClassifier {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade: ");

        int mark = sc.nextInt();
        String grade = "";

        if (mark >= 70){
            grade = "Passed";
        } else if (mark >= 70) {
            grade = "A";
        } else if (mark >= 60) {
            grade = "B";
            
        } else if (mark >= 50) {
            grade = "C";


            
        }else {
            grade = "fail";
        }
        System.out.println("Your grade is " + grade);
    }
}
