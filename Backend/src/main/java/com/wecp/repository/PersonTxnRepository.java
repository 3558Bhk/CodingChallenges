// src/main/java/com/wecp/repository/PersonTxnRepository.java

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonTxnRepository extends JpaRepository<PersonTransaction, Long> {
    // Add custom queries if needed
}
