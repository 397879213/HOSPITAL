 
package utilities;

import java.util.*;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

public class SendMailTLS {

    private static String USER_NAME = "duhsreports@gmail.com";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = "emailqueue"; // GMail password
    
    
    
    
    public static void main(String[] args) {
        
        String from = USER_NAME;
        
        String[] to = {"sibtainpasha@gmail.com"}; // list of recipient email addresses
        String subject = "Java send mail example";
        String body = "Welcome to JavaMail!";
        sendFromGMail(from,to, subject, body, "D:\\PACS_SERVER\\14-10-2014\\00200112019810-1\\00200112019810-1.pdf","123.pdf");
        
    }

    public static boolean sendFromGMail(String from,  String[] to, String subject, 
            String body,String attachFilePath , String attachFileName) {
        
        
        boolean ret = true;
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", PASSWORD);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.debug", "true");
        Session session = Session.getDefaultInstance(props);
        
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for (int i = 0; i < to.length; i++) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for (int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }
            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, PASSWORD);
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(body);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(attachFilePath);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(attachFileName);
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            message.saveChanges();
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            ret = true;
        } catch (AddressException ae) {
            ret = false;
            ae.printStackTrace();
        } catch (MessagingException me) {
            ret = false;
            me.printStackTrace();
        }
        
        return ret;
    }
    
    class GMailAuthenticator extends Authenticator {
     String user;
     String pw;
     public GMailAuthenticator (String username, String password)
     {
        super();
        this.user = username;
        this.pw = password;
     }
    public PasswordAuthentication getPasswordAuthentication()
    {
       return new PasswordAuthentication(user, pw);
    }
}
}
