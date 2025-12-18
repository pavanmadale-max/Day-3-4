package com.assignment.wallet.validator;


import com.assignment.wallet.model.WalletTransaction;

public class TransactionValidator {

    public static String validate(Object obj) {

        if (obj instanceof WalletTransaction tx) {
            return tx.amount() > 10_000
                    ? "HIGH_VALUE_TRANSACTION"
                    : "NORMAL_TRANSACTION";
        }

        return "INVALID_OBJECT";
    }
}