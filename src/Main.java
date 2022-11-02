public class Main {
    public static void main(String[] args) {
        // Create object
        Computer computerMove = new Computer();
        User userMove = new User();

        // Assign value to variable
        int userMoveNumber = userMove.getUserMove();
        int computerMoveNumber = computerMove.getComputerMove();

        // Condition
        if (userMoveNumber == computerMoveNumber) {
            System.out.println("Game is Tie !!");
        } else if (userMoveNumber > computerMoveNumber) {
            System.out.println("You Win !!");
        } else {
            System.out.println("Computer Win !!");
        }
    }
}