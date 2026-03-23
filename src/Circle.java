import java.util.Scanner;
public class Circle {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        double  pie = 3.14;
        System.out.print("Enter your Radius:");

        int r = sc.nextInt() ;
        double area = pie * r * r;
        System.out.printf("The area of the circle is = %2f%n " , area);
    }
}
