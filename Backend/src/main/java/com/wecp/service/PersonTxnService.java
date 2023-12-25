// src/main/java/com/wecp/service/PersonTxnService.java

import java.util.List;

public interface PersonTxnService {
    PersonTransaction addOrUpdateTransaction(PersonTransaction transaction);
    void deleteTransaction(Long id);
    List<PersonTransaction> fetchAllTransactions();
    double calculateTotalSales();
    double calculateTotalCashSales();
    double calculateTotalCreditCardSales();
    PersonTransaction fetchPersonWithMostSales();
}
