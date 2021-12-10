

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissor extends InvalidInput{

    public RockPaperScissor() {
        super(Player.invalid_user_input);
    }

    public static void main(String[] args) throws InvalidInput {

           Scanner sc = new Scanner(System.in);

           System.out.println("ROCK PAPER SCISSOR GAME");
           //Choice of 2 players or player vs computer
           System.out.println("Enter your choice: 1 for player vs player" + " or " + "2 for player vs computer");

           String choice = sc.nextLine();

           //If player chooses 1 ie (2 players)

            switch (choice) {
            case "1":
                System.out.println("Player 1 input");
                //String input1 = new jline.ConsoleReader().readLine(new Character('*'));
                String input1 = sc.nextLine();
                System.out.println("Player 2 input");
                String input2 = sc.nextLine();
                Player player = new Player();
                player.play(input1, input2);
               break;

                case "2":

                    System.out.println("Player input");
                    String input = sc.nextLine();
                    //creating Computer class object
                    Computer computer = new Computer();

                    //creating random object
                    Random random = new Random();

                    // Calling setValue in Computer class and passing random value between 1 to 3
                    computer.setValue(toString(random.nextInt(3) + 1));
                    //Calling getValue to get computer generated choice
                    String computerValue = computer.getValue();
                    System.out.println("Computer chose: " + computerValue);
                    computer.play(input, computerValue);
                    break;

                default: throw new InvalidInput();
            }
    }

    //If player chooses 2 ie (player vs computer)

    private static String toString(int i) {
            return Integer.toString(i);
    }
}


