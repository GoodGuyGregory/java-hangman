import java.util.Scanner;

class Prompter {
    private Game game;
    private String guess;

    public Prompter(Game game) {
        // takes a game to prompt to
        this.game = game;
    }

    // Method that Prompts for the guess
    public boolean promptForGuess() {
        Scanner input = new Scanner(System.in);
        boolean isHit = false;
        boolean isAcceptable = false;

        do {
            System.out.print("Enter a letter:  ");
            String guessInput = input.nextLine();

            try {
                isHit = game.applyGuess(guessInput);
                // Checks Validation
                isAcceptable = true;
            } catch (IllegalArgumentException iae) {
                System.out.printf("%s Please try again. %n", iae.getMessage());
            }
        } while (!isAcceptable);
        return isHit;
    }

    public void displayProgress() {
        System.out.printf("You have %d tries left to solve: %s%n", game.getRemainingTries(), game.getCurrentProgress());
    }

    public void displayOutcome() {
        if (game.isWon()) {
            System.out.printf("You Won! Congratulations! with %d tries remaining for the word %s %n",
                    game.getRemainingTries(), game.getAnswer());
        } else {
            System.out.printf("So Close! but the answer is %s %n", game.getAnswer());
        }
    }
}