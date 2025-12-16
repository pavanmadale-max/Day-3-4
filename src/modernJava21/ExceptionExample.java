package modernJava21;


public class ExceptionExample {

    public static void main(String[] args) {

        try {
            int amount = -100;

            // validation
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }

            System.out.println("Transaction successful");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

