class Game {
    public static final int MAX_MISSES = 7;
    private String answer;
    private String hits;
    private String misses;

    public Game(String answer) {
        this.answer = answer.toLowerCase();
        hits = "";
        misses = "";
    }

    public int getRemainingTries() {
        return MAX_MISSES - misses.length();
    }

    private char normalizeGuess(char letter) {
        // Checks if the char is not a letter
        if (!Character.isLetter(letter)) {
            throw new IllegalArgumentException("A letter is required");
        }
        // Converts to lowercase letter
        letter = Character.toLowerCase(letter);
        if (misses.indexOf(letter) != -1 || hits.indexOf(letter) != -1) {
            throw new IllegalArgumentException(letter + " has already been guessed");
        }
        // returns normalized data
        return letter;
    }

    // applyGuess checks for Strings and Chars from user input

    public boolean applyGuess(String letters) {
        if (letters.length() == 0) {
            throw new IllegalArgumentException("No Letter Found");
        }
        // use the old method to take the handling logic
        return applyGuess(letters.charAt(0));
    }

    public boolean applyGuess(char letter) {
        // if the index is greater than -1 it is a part
        // of the answer and therefore a hit
        // Uses Data normalization techniques:
        letter = normalizeGuess(letter);

        boolean isHit = answer.indexOf(letter) != -1;
        if (isHit) {
            hits += letter;
        } else {
            // adds to the letters of misses
            misses += letter;
        }
        return isHit;
    }

    // Checks weather the letter is
    public String getCurrentProgress() {
        String progress = "";
        for (char letter : answer.toCharArray()) {
            char display = '-';
            // if letter is found from the "hits" array
            if (hits.indexOf(letter) != -1) {
                // add the letter to the display
                // at that letter location
                display = letter;
            }
            progress += display;
        }
        // pass the display mesage to the prompter
        return progress;
    }

    public boolean isWon() {
        // uses method chaining
        return getCurrentProgress().indexOf('-') == -1;
    }

    public String getAnswer() {
        return this.answer;
    }
}