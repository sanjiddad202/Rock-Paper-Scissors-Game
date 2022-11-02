import java.util.Scanner;

public class User {
    public int getUserMove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your move? (Enter 1 to ROCK, 2 to PAPER, 3 to SCISSORS)");
        int userNumber = sc.nextInt();
        if (userNumber <= 3) {
            switch (userNumber) {
                case 1 -> System.out.println("You select: ROCK");
                case 2 -> System.out.println("You select: PAPER");
                case 3 -> System.out.println("You select: SCISSORS");
            }
        } else {
            System.out.println("Invalid user move.");
            return 0;
        }
        return userNumber;
    }
}
