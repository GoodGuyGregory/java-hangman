// Creates the PezDispenser Class
class PezDispenser {
    // Class Scope
    // Final is the once and only once method for assigning a PEZ head
    final private String characterName;
    public static final int MAX_PEX = 12;
    private int pezCount;

    // Create Constructor:
    public PezDispenser(String characterName) {
        this.characterName = characterName;
        // Ensures that there is no pez starting out
        pezCount = 0;
    }

    // Method to fill the pez
    public void fill() {
        fill(MAX_PEX);
    }

    // Throwing an Exception
    public void fill(int pezAmount) {
        int newAmount = pezCount + pezAmount;
        if (newAmount > MAX_PEX) {
            throw new IllegalArgumentException("Too many PEZ!!!");
        }
        pezCount = newAmount;
    }

    public boolean dispense() {
        boolean wasDispensed = false;
        if (!isEmpty()) {
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public boolean isEmpty() {
        return pezCount == 0;
    }

    // Accessor Method:
    public String getCharacterName() {
        // String Contains
        return characterName;
    }// getCharacterName

}