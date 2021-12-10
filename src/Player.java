 class Player extends RockPaperScissor {

    static final String invalid_user_input= "Invalid Input" ;
    public Player() {
        super();
    }

    public void play(String input1, String input2){
        if ((input1.equalsIgnoreCase("rock")) && (input2.equalsIgnoreCase("paper"))){
            System.out.println("Player 2 wins");

        }
        else if ((input1.equalsIgnoreCase("paper")) && (input2.equalsIgnoreCase("rock"))) {
            System.out.println("Player 1 wins");
        }
        else if ((input1.equalsIgnoreCase("rock")) && (input2.equalsIgnoreCase("scissor")))
        {
            System.out.println("Player 1 wins");

        }
        else if ((input1.equalsIgnoreCase("scissor")) && (input2.equalsIgnoreCase("rock")))
        {
            System.out.println("Player 2 wins");

        }
        else if ((input1.equalsIgnoreCase("paper")) && (input2.equalsIgnoreCase("scissor"))){
            System.out.println("Player 2 wins");
        }
        else if((input1.equalsIgnoreCase("scissor")) && (input2.equalsIgnoreCase("paper"))) {
            System.out.println("Player 1 wins");
        }
        else if (input1.equalsIgnoreCase(input2)) {
            System.out.println("Its a tie");
        }


    }


}
