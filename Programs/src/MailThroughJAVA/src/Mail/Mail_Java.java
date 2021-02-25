package Mail;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
public class Mail_Java {
  public static void main(String[] args) throws EmailException {
    HtmlEmail mail = new HtmlEmail();
    mail.setHostName("smtp.mailtrap.io");
    mail.setSmtpPort(2525);
    mail.setAuthenticator(new DefaultAuthenticator("1a2b3c4d5e6f7g", "1a2b3c4d5e6f7g"));

    mail.setFrom("ashfaaq.md12@aol.com", "From");
    mail.addTo("ashfaaq.md12@gmail.com", "To");
    mail.setSubject("Apache Commons email test");
    mail.setHtmlMsg("<p style='font-size:16px;color:green'>Here is your example</p>");
    mail.send();
 }
}