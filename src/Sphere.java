import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pie = (22 / 7);

        System.out.print("Enter radius of the sphere: ");
        int r = sc.nextInt();

        double volume  = (4 / 3) * pie * r * r * r;
        double surfaceArea = 4 * pie * r * r;

        System.out.printf("Volume:       %.2f%n", volume);
        System.out.printf("Surface Area: %.3f%n", surfaceArea);
    }
}