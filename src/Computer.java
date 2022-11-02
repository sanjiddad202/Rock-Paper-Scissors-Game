import java.util.Random;

public class Computer {
    public int getComputerMove() {
        Random ran = new Random();
        int randNumber = ran.nextInt(3) + 1;
        switch (randNumber) {
            case 1 -> System.out.println("Computer select: ROCK");
            case 2 -> System.out.println("Computer select: PAPER");
            case 3 -> System.out.println("Computer select: SCISSORS");
        }
        return randNumber;
    }
}
