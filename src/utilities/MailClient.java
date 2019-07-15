/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class MailClient {

    public void sendMail(String from, String to,
            String subject, String messageBody) throws MessagingException, AddressException {
// Setup mail server
        String host = "smtp.gmail.com";
        String username = "sibtainpasha@gmail.com";
        String password = "tet";
        Properties props = new Properties();
        props.put("mail.smtps.auth", "true");

// Get a mail session
        Session session = Session.getDefaultInstance(props, null);

// Define a new mail message
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject(subject);

        message.setText(messageBody);

// Send the message
        Transport t = session.getTransport("smtps");
        try {
            t.connect(host, username, password);
            t.sendMessage(message, message.getAllRecipients());
        } finally {
            t.close();
        }

    }

    public static void main(String[] args) {
        try {
            MailClient client = new MailClient();
            String from = "your_email_address";
            String to = "sdsdsdsds@RecipientsCarriersSMTP.com";
            String subject = "Test";
            String message = "I'm testing. Do you see this?";

            client.sendMail(from, to, subject, message);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

    }
}
