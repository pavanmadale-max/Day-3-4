package Assignment;

import java.util.List;

public class WalletTransactionApp {

    // Record
    record WalletTransaction(String id, double amount, String type) {
        public WalletTransaction {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }
            if (!type.equalsIgnoreCase("CREDIT") &&
                    !type.equalsIgnoreCase("DEBIT")) {
                throw new IllegalArgumentException("Type must be CREDIT or DEBIT");
            }
        }
    }

    // Utility methods using Streams API
    static class WalletUtils {

        // Filter CREDIT transactions
        static List<WalletTransaction> getCreditTransactions(List<WalletTransaction> list) {
            return list.stream()
                    .filter(t -> t.type().equalsIgnoreCase("CREDIT"))
                    .toList();
        }

        // Calculate total CREDIT amount
        static double getTotalCreditAmount(List<WalletTransaction> list) {
            return list.stream()
                    .filter(t -> t.type().equalsIgnoreCase("CREDIT"))
                    .mapToDouble(WalletTransaction::amount)
                    .sum();
        }

        // Calculate total DEBIT amount
        static double getTotalDebitAmount(List<WalletTransaction> list) {
            return list.stream()
                    .filter(t -> t.type().equalsIgnoreCase("DEBIT"))
                    .mapToDouble(WalletTransaction::amount)
                    .sum();
        }
    }

    public static void main(String[] args) {

        List<WalletTransaction> transactions = List.of(
                new WalletTransaction("T1", 500, "CREDIT"),
                new WalletTransaction("T2", 200, "DEBIT"),
                new WalletTransaction("T3", 300, "CREDIT"),
                new WalletTransaction("T4", 100, "DEBIT")
        );

        System.out.println("Credit Transactions:");
        WalletUtils.getCreditTransactions(transactions)
                .forEach(System.out::println);

        System.out.println("Total Credit Amount: " +
                WalletUtils.getTotalCreditAmount(transactions));

        System.out.println("Total Debit Amount: " +
                WalletUtils.getTotalDebitAmount(transactions));
    }
}
