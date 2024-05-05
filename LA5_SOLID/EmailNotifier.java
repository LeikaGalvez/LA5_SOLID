package LA5_SOLID;

public class EmailNotifier implements EmailSender{
    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}
