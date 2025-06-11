package TransactionManagement.Transaction.TransactionalAnnotation.servicce;

import TransactionManagement.Transaction.TransactionalAnnotation.dto.OrderRequest;
import TransactionManagement.Transaction.TransactionalAnnotation.dto.OrderResponse;
import TransactionManagement.Transaction.TransactionalAnnotation.entity.Order;
import TransactionManagement.Transaction.TransactionalAnnotation.entity.Payment;
import TransactionManagement.Transaction.TransactionalAnnotation.exception.PaymentException;
import TransactionManagement.Transaction.TransactionalAnnotation.repository.OrderRepository;
import TransactionManagement.Transaction.TransactionalAnnotation.repository.PaymentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final PaymentRepository paymentRepository;

    public OrderService(OrderRepository orderRepository, PaymentRepository paymentRepository) {
        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
    }

    @Transactional
    public OrderResponse placeOrder(OrderRequest orderRequest) {

        //save order details
        Order order = orderRequest.getOrder();
        order.setStatus("inPROGRESS");
        order.setOrderTackingNumber(UUID.randomUUID().toString());
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();

        if(!payment.getType().equals("DEBIT")){
            throw new PaymentException("Payment card type do not support");
        }

        //save payment details
        payment.setOrderId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTackingNumber(order.getOrderTackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("SUCCESS");
        return orderResponse;
    }
}
