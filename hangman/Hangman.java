public class Hangman {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: Java Hangman <answer>");
            System.err.println("Answer is Required");
            System.exit(1);
        }

        Game game = new Game(args[0]);
        Prompter prompter = new Prompter(game);

        // Shows the letters to the client
        while (game.getRemainingTries() > 0 && !game.isWon()) {

            prompter.displayProgress();
            // Checks if the letter is in the word
            // boolean isHit = prompter.promptForGuess();
            // if (isHit) {
            // System.out.println("We got a hit!");
            // } else {
            // System.out.println("Oops a miss");
            // } // else
            // Displays the progress for the user
            prompter.promptForGuess();
        }
        prompter.displayOutcome();
    }// main
}
// class