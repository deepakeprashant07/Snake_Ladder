import java.util.Scanner;

public class RollsDice {
    public static void main(String[] args) {
        int Player_Position = 0;
        int Dice_Value=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome To Snake And Ladder Game");
        System.out.println("Player Position " + Player_Position);
        System.out.println("Press R To Roll Dice");
        String start = scan.next();
        while ("r".equals(start)) {
            Dice_Value=(int) (Math.random() * (6 - 1 + 1)) + 1;;
            System.out.println("Dice Value " + Dice_Value);
            System.out.println("Player Position " + (Player_Position+Dice_Value));
            break;
        }

    }
}
