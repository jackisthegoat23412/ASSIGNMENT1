import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continuePlay = true;
        while (continuePlay) {
            String playerAMove = "";
            String playerBMove = "";
            while (true) {
                System.out.print("Player A: Choose Rock (R), Paper (P), or Scissors (S): ");
                playerAMove = in.next().trim().toUpperCase();
                if (playerAMove.equals("R") || playerAMove.equals("P") || playerAMove.equals("S")) {
                    break;
                }
                System.out.println("Please enter R, P, or S.");
            }
            while (true) {
                System.out.print("Player B: Choose Rock (R), Paper (P), or Scissors (S): ");
                playerBMove = in.next().trim().toUpperCase();
                if (playerBMove.equals("R") || playerBMove.equals("P") || playerBMove.equals("S")) {
                    break;
                }
                System.out.println("Invalid choice! ");
            }
            if (playerAMove.equals(playerBMove)) {
                String moveName = playerAMove.equals("R") ? "Rock" : (playerAMove.equals("P") ? "Paper" : "Scissors");
                System.out.println(moveName + " vs " + moveName + " tie!");
            } else if (playerAMove.equals("R")) {
                if (playerBMove.equals("S")) {
                    System.out.println("Rock breaks Scissors! Player A wins!");
                } else {
                    System.out.println("Paper covers Rock! Player B wins!");
                }
            } else if (playerAMove.equals("P")) {
                if (playerBMove.equals("R")) {
                    System.out.println("Paper covers Rock! Player A wins!");
                } else {
                    System.out.println("Scissors cuts Paper! Player B wins!");
                }
            } else if (playerAMove.equals("S")) {
                if (playerBMove.equals("P")) {
                    System.out.println("Scissors cuts Paper! Player A wins!");
                } else {
                    System.out.println("Rock breaks Scissors! Player B wins!");
                }
            }
            while (true) {
                System.out.print("Do you want to play again? [Y/N]: ");
                String playAgain = in.next().trim().toUpperCase();
                if (playAgain.equals("Y")) {
                    break;
                } else if (playAgain.equals("N")) {
                    continuePlay = false;
                    System.out.println("Thanks for playing!");
                    break;
                } else {
                    System.out.println("Invalid input.");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
