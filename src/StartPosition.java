import java.util.Scanner;

public class StartPosition {
    public static void main(String[] args) {
        int Player_Position = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome To Snake And Ladder Game");
        System.out.println("Are You Ready Press Y Or N");
        String start = scan.next();
        while ("y".equals(start)) {
            System.out.println("Player Position " + Player_Position);
            break;
        }
    }
}
