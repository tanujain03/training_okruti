package TransactionManagement.Transaction.TransactionalAnnotation.repository;


import TransactionManagement.Transaction.TransactionalAnnotation.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
