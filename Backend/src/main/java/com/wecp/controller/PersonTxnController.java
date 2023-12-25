// src/main/java/com/wecp/controller/PersonTxnController.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonTxnController {
    @Autowired
    private PersonTxnService personTxnService;

    @PostMapping("/addOrUpdate")
    public PersonTransaction addOrUpdateTransaction(@RequestBody PersonTransaction transaction) {
        return personTxnService.addOrUpdateTransaction(transaction);
    }

    @PostMapping("/delete")
    public void deleteTransaction(@RequestParam Long id) {
        personTxnService.deleteTransaction(id);
    }

    @GetMapping("/fetchAllPersonTransactions")
    public List<PersonTransaction> fetchAllTransactions() {
        return personTxnService.fetchAllTransactions();
    }

    @GetMapping("/calculateTotalSales")
    public double calculateTotalSales() {
        return personTxnService.calculateTotalSales();
    }

    @GetMapping("/calculateTotalCashSales")
    public double calculateTotalCashSales() {
        return personTxnService.calculateTotalCashSales();
    }

    @GetMapping("/calculateTotalCreditCardSales")
    public double calculateTotalCreditCardSales() {
        return personTxnService.calculateTotalCreditCardSales();
    }

    @GetMapping("/fetchPersonWithMostSales")
    public PersonTransaction fetchPersonWithMostSales() {
        return personTxnService.fetchPersonWithMostSales();
    }
}
