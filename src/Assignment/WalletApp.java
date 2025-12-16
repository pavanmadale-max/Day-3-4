package Assignment;

import java.time.LocalDateTime;

public class WalletApp {

    record WalletTransaction(
            String transactionId,
            double amount,
            String type,
            LocalDateTime timestamp
    ) {

        // Compact constructor for validation
        public WalletTransaction {
            if (transactionId == null || transactionId.isBlank()) {
                throw new IllegalArgumentException("Transaction ID cannot be null or blank");
            }

            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero");
            }

            if (type == null || type.isBlank()) {
                throw new IllegalArgumentException("Transaction type cannot be null or blank");
            }

            if (!type.equalsIgnoreCase("CREDIT") && !type.equalsIgnoreCase("DEBIT")) {
                throw new IllegalArgumentException("Transaction type must be CREDIT or DEBIT");
            }

            if (timestamp == null) {
                throw new IllegalArgumentException("Timestamp cannot be null");
            }
        }
    }

    public static void main(String[] args) {

        WalletTransaction transaction = new WalletTransaction(
                "TXN202",
                750.50,
                "CREDIT",
                LocalDateTime.now()
        );

        System.out.println(transaction);
    }
}
