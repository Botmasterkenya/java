import java.util.Scanner;
public class Name{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your First Name:");

        String Firstname = sc.nextLine();
        System.out.print("Enter your Last Name:");

        String Lastname = sc.nextLine();

        String names = Firstname + Lastname;
        System.out.println("Your both names are:" + names);






    }
}
