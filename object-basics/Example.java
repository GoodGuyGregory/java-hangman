
public class Example {
    public static void main(String[] args) {
        System.out.println("Making a new PEZ Dispenser");
        // Creates a New Object
        PezDispenser dispenser = new PezDispenser("Yoda");
        System.out.printf("FUN FACT: There are %d PEZ allowed in evert PEZ dispenser %n", PezDispenser.MAX_PEX);
        if (dispenser.isEmpty()) {
            System.out.println("Dispenser is Empty");
        }

        // Creates a PezDispenser
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
        System.out.println("Filling the dispenser with delicious PEZ");
        dispenser.fill();

        if (!dispenser.isEmpty()) {
            System.out.println("Dispenser is full");
        }
        while (dispenser.dispense()) {
            System.out.println("Chomp!");
        }
        if (dispenser.isEmpty()) {
            System.out.println("No PEZ left");
        }
        dispenser.fill(4);
        dispenser.fill(2);
        while (dispenser.dispense()) {
            System.out.println("Chomping More Pez!");
        }

        try {
            // Testing the amount the pez dispenser can hold.
            // Should throw the exception
            dispenser.fill(420);
            System.out.println("This will never happen");
        } catch (IllegalArgumentException iae) {
            System.out.println("Whoa there!");
            System.out.printf("The ERROR %s", iae.getMessage());
        }
    }
}