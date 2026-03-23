import java.util.Scanner;

public class Seconds{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total seconds: ");
        int totalSeconds = sc.nextInt();

        int hours   = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(totalSeconds + " seconds = " + hours + " hour(s), " + minutes + " minute(s), " + seconds + " second(s)");
    }
}
