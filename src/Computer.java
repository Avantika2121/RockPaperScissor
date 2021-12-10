import java.util.Objects;
import java.util.Random;

public class Computer extends RockPaperScissor {

    String value;

    //getter method
    public String getValue() {

        return value;
    }

    //setter method
    public void setValue(String value) {

        if (Objects.equals(this.value, "1")) {
            this.value = "rock";
        } else if (Objects.equals(value, "2")) {
            this.value = "paper";
        } else {
            this.value = "scissor";
        }
    }

    public void play(String input, String computerValue){
        if (((input.equalsIgnoreCase("rock")) && (computerValue == "paper"))
                || ((input.equalsIgnoreCase("paper")) && (computerValue.equalsIgnoreCase("rock")))) {
            System.out.println("Paper wins");
        } else if (((input.equalsIgnoreCase("rock")) && (computerValue.equalsIgnoreCase("scissor")))
                || ((input.equalsIgnoreCase("scissor")) && (computerValue.equalsIgnoreCase("rock")))) {
            System.out.println("Rock wins");
        } else if (((input.equalsIgnoreCase("paper")) && (computerValue.equalsIgnoreCase("scissor")))
                || ((input.equalsIgnoreCase("scissor")) && (computerValue.equalsIgnoreCase("paper")))) {
            System.out.println("Scissor wins");
        } else if (input.equalsIgnoreCase(computerValue)) {
            System.out.println("Its a tie");
        }
    }

}


