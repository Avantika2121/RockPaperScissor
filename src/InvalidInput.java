public class InvalidInput extends Throwable {
    public InvalidInput(String invalid_user_input) {

        //System.out.println("Invalid input!");
    }

    public InvalidInput() {
        System.out.println("Invalid input! Please Enter 1 or 2.");
    }
}
