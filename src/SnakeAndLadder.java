import java.util.Scanner;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int Win_Position=100;
        int Dice_Value=0;
        int Dice_Counter=0;
        int Player_Position=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\t\tWelcome To Snake And Ladder Game");
        System.out.println("Dice Current Value ="+Dice_Value);
        System.out.println("Your Current Position ="+Player_Position);
        while ((Player_Position<Win_Position))
        {
            System.out.println("Please Roll The Dice Press r");
            String Roll=scan.next();
            if ("r".equals(Roll))
            {
                Dice_Value = (int) (Math.random() * (6 - 1 + 1)) + 1;
                Player_Position=Player_Position+Dice_Value;
                Dice_Counter+=1;
                if (Player_Position==Win_Position)
                {
                    System.out.println("\n\t\t Congratulations! You Are The winner");
                    System.out.println(" Number of Time Dice Through =" +Dice_Counter);
                } else if (Player_Position>Win_Position) {
                    Player_Position=Player_Position-Dice_Value;
                } else if (Player_Position==0) {
                    System.out.println("Player got the ladder and moves ahead then Position "+Player_Position);
                }else
                {
                    switch (Player_Position)
                    {
                        case 35:
                            System.out.println("Oops..Snakebite..Go Down");
                            Player_Position=6;
                            break;
                        case 55:
                            System.out.println("Oops..Snakebite..Go Down");
                            Player_Position=11;
                            break;
                        case 75:
                            System.out.println("Oops..Snakebite..Go Down");
                            Player_Position=21;
                            break;
                        case 99:
                            System.out.println("Oops..Snakebite..Go Down");
                            Player_Position=31;
                            break;
                        default:
                            Player_Position=Player_Position;
                    }
                    switch (Player_Position)
                    {
                        case 7:
                            System.out.println("Waw Nice! climbing the ladder....GO UP");
                            Player_Position=49;
                            break;
                        case 17:
                            System.out.println("Waw Nice! climbing the ladder....GO UP");
                            Player_Position=39;
                            break;
                        case 37:
                            System.out.println("Waw Nice! climbing the ladder....GO UP");
                            Player_Position=69;
                            break;
                        case 57:
                            System.out.println("Waw Nice! climbing the ladder....GO UP");
                            Player_Position=98;
                            break;
                        default:
                            Player_Position=Player_Position;
                    }
                }
                System.out.println(" Dice Current Value = " +Dice_Value);
                System.out.println(" Player Current Position =" +Player_Position);
            }else {
                System.out.println("Wrong Key Enter Please Press r");
            }
        }
    }
}
