import java.util.Random;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            System.out.printf("%-5s %-5s %-5s %-5s %-5s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("-------------------------------------------------");

            int rollCount = 0;
            while (true) {
                rollCount++;
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-5d %-5d %-5d %-5d %-5d\n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    break;
                }
            }

            System.out.print("Play again? [Y/N]: ");
            playAgain = scanner.next().equalsIgnoreCase("Y");
        }
        scanner.close();
    }
}