import java.util.Scanner;
public class CubeVolume{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        int length = sc.nextInt();

        System.out.print("Enter Width: ");
        int width = sc.nextInt();

        System.out.print("Enter Height: ");
        int height = sc.nextInt();

        int volume = length * width * height;

        System.out.println("Volume of the cube: " + volume);
    }
}