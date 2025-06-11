package TransactionManagement.Transaction.TransactionalAnnotation.dto;

import TransactionManagement.Transaction.TransactionalAnnotation.entity.Order;
import TransactionManagement.Transaction.TransactionalAnnotation.entity.Payment;
import lombok.Getter;
import lombok.Setter;

    @Getter
    @Setter
    public class OrderRequest {
        private Order order;
        private Payment payment;
    }


