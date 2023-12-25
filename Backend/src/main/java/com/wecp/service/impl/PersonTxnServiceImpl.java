// src/main/java/com/wecp/service/impl/PersonTxnServiceImpl.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonTxnServiceImpl implements PersonTxnService {
    @Autowired
    private PersonTxnRepository repository;

    @Override
    public PersonTransaction addOrUpdateTransaction(PersonTransaction transaction) {
        // Implementation to add or update transaction in the repository
    }

    @Override
    public void deleteTransaction(Long id) {
        // Implementation to delete transaction by id from the repository
    }

    @Override
    public List<PersonTransaction> fetchAllTransactions() {
        // Implementation to fetch all transactions from the repository
    }

    @Override
    public double calculateTotalSales() {
        // Implementation to calculate total sales
    }

    @Override
    public double calculateTotalCashSales() {
        // Implementation to calculate total cash sales
    }

    @Override
    public double calculateTotalCreditCardSales() {
        // Implementation to calculate total credit card sales
    }

    @Override
    public PersonTransaction fetchPersonWithMostSales() {
        // Implementation to fetch person with the most sales
    }
}
