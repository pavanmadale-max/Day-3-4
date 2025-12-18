package com.assignment.wallet.util;


import com.assignment.wallet.model.WalletTransaction;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionUtils {

    public static double totalAmount(List<WalletTransaction> list) {
        return list.stream()
                .mapToDouble(WalletTransaction::amount)
                .sum();
    }

    public static List<WalletTransaction> filterByType(
            List<WalletTransaction> list, String type) {

        return list.stream()
                .filter(tx -> tx.type().equalsIgnoreCase(type))
                .toList();
    }

    public static Map<String, Double> totalByType(
            List<WalletTransaction> list) {

        return list.stream()
                .collect(Collectors.groupingBy(
                        WalletTransaction::type,
                        Collectors.summingDouble(WalletTransaction::amount)
                ));
    }
}