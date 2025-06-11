package TransactionManagement.Transaction.TransactionalAnnotation.exception;

public class PaymentException extends RuntimeException {
    public PaymentException(String message){
        super(message);
    }
}
