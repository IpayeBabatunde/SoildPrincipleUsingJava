package OpenClosedPrinciple;

public interface NotificationService {
    public void sendOTP(String medium);
    public void sendTransactionReport(String medium);
}
