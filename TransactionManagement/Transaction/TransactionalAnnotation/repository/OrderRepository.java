package TransactionManagement.Transaction.TransactionalAnnotation.repository;


import TransactionManagement.Transaction.TransactionalAnnotation.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
