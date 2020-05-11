public class DiscountCode {

    public static void main(String[] args) {
        // This is here just for example use cases.

        Order order = new Order("Yoda PEZ Dispenser", 600);

        // These are valid. They are letters and the $ character only
        order.applyDiscountCode("abc");
        order.getDiscountCode(); // ABC

        order.applyDiscountCode("$ale");
        order.getDiscountCode(); // $ALE

        try {
            // This will throw an exception because it contains numbers
            order.applyDiscountCode("ABC123");
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage()); // Prints "Invalid discount code"
        }
        try {
            // This will throw as well, because it contains a symbol.
            order.applyDiscountCode("w@w");
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage()); // Prints "Invalid discount code"
        }

    }
}
