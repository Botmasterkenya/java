import java.util.Scanner;

public class Square{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter value of s:");
        int s = sc.nextInt();
        double area = s * s;
        System.out.printf("The area is %2f" , area);
    }
}

