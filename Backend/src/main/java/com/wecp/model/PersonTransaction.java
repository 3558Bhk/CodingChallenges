// src/main/java/com/wecp/model/PersonTransaction.java

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class PersonTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String personName;
    private double transactionAmount;
    private String transactionType;

    public PersonTransaction() {
        // Default constructor required by JPA
    }

    public PersonTransaction(String personName, double transactionAmount, String transactionType) {
        this.personName = personName;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "PersonTransaction{" +
                "id=" + id +
                ", personName='" + personName + '\'' +
                ", transactionAmount=" + transactionAmount +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonTransaction that = (PersonTransaction) o;
        return Double.compare(that.transactionAmount, transactionAmount) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(personName, that.personName) &&
                Objects.equals(transactionType, that.transactionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, personName, transactionAmount, transactionType);
    }
}
