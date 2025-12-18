package com.assignment.wallet.test;

import com.assignment.wallet.model.WalletTransaction;
import com.assignment.wallet.util.TransactionUtils;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void shouldCalculateTotal() {
        List<WalletTransaction> list = List.of(
                new WalletTransaction(1L, 100, "CREDIT", LocalDateTime.now()),
                new WalletTransaction(2L, 200, "DEBIT", LocalDateTime.now())
        );

        assertEquals(300, TransactionUtils.totalAmount(list));
    }

    @Test
    void shouldFailForNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () ->
                new WalletTransaction(1L, -10, "CREDIT", LocalDateTime.now())
        );
    }
}
