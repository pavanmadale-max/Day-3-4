package Assignment;

public class TransactionValidatorApp {

    // Record
    record WalletTransaction(String id, double amount, String type) {}

    // Validator class using pattern matching
    static class TransactionValidator {

        static boolean validate(Object obj) {

            // Pattern matching for instanceof
            if (obj instanceof WalletTransaction tx) {

                if (tx.id() == null || tx.id().isBlank()) {
                    return false;
                }

                if (tx.amount() <= 0) {
                    return false;
                }

                if (!tx.type().equalsIgnoreCase("CREDIT")
                        && !tx.type().equalsIgnoreCase("DEBIT")) {
                    return false;
                }

                return true; // valid transaction
            }

            return false; // not a WalletTransaction
        }
    }

    public static void main(String[] args) {

        WalletTransaction tx =
                new WalletTransaction("TXN1", 500, "CREDIT");

        boolean isValid = TransactionValidator.validate(tx);

        System.out.println("Is transaction valid? " + isValid);
    }
}
