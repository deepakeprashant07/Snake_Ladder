import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class PlayerCheckOption {
    public static void main(String[] args) {
        SnakeLadders play = new SnakeLadders();
        play.startGame();
    }
}

class SnakeLadders {
    static Map<Integer, Integer> snake = new HashMap<>();
    static Map<Integer, Integer> ladder = new HashMap<>();

    {
        snake.put(99, 54);
        snake.put(95, 25);
        snake.put(72, 42);
        snake.put(25, 2);

        ladder.put(4, 25);
        ladder.put(11, 40);
        ladder.put(60, 85);
        ladder.put(46, 90);
        ladder.put(17, 69);
    }

    public int calculateRunningValue(int Player_Pos, int Dice_val) {
        int Player_New_Position = Player_Pos + Dice_val;
        if (null != snake.get(Player_New_Position)) {
            System.out.println("Oops..Snakebite..");
            Player_New_Position = snake.get(Player_New_Position);
        }
        if (null != ladder.get(Player_New_Position)) {
            System.out.println("Waw Nice! climbing the ladder....");
            Player_New_Position = ladder.get(Player_New_Position);
        }
        return Player_New_Position;
    }

    public void startGame() {
        int Player_Position = 0;
        int Dice_Value = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome To Snake And Ladder Game");
        System.out.println("Player Position " + Player_Position);
        System.out.println("Press R To Roll Dice");
        String start = scan.next();
        if ("r".equals(start)) {
            Dice_Value = (int) (Math.random() * (6 - 1 + 1)) + 1;
            Player_Position = calculateRunningValue(Player_Position, Dice_Value);
            System.out.println("Are You Ready To Play Press Y or N");
            String play = scan.next();
            if ("y".equals(play)) {
                System.out.println("Dice Value " + Dice_Value);
                System.out.println("Player Position " + Player_Position);
            } else {
                System.out.println("Thank You!");
            }
        }
    }
}