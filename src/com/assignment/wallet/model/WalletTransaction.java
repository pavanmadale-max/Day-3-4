package com.assignment.wallet.model;

import java.time.LocalDateTime;

public record WalletTransaction(
        Long id,
        double amount,
        String type,
        LocalDateTime timestamp
) {
    public WalletTransaction {
        if (id == null || id <= 0)
            throw new IllegalArgumentException("Invalid transaction id");

        if (amount <= 0)
            throw new IllegalArgumentException("Amount must be > 0");

        if (type == null || type.isBlank())
            throw new IllegalArgumentException("Type is required");

        if (timestamp == null)
            throw new IllegalArgumentException("Timestamp required");
    }
}