package utilities;

import java.security.Security;
import java.util.Properties;

import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {

    public static String SMTP_HOST_NAME = "smtp.gmail.com";
    public static String SMTP_PORT = "587";

    public static final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
    public static final String emailFrom = "azntdc@gmail.com";
    public static String emailMsgTxt = "Teesting email";
    public static String emailSubjectTxt = "Welcom Java";
    public static String attachFileName = "REporting File";
    public static String attachFilePath = "D:\\PLCReportingList.xls";
    public static String[] sendTo = null;
    final String username = "azntdc@gmail.com";
    final String password = "Pakistan92";

    public boolean sendEmail() {

        boolean ret = true;
        try {
            Properties props = new Properties();
            props.put("mail.smtp.host", SMTP_HOST_NAME);
            props.put("mail.smtp.auth", "true");
            props.put("mail.debug", "true");
            //props.put("mail.smtp.port", SMTP_PORT);
            props.put("mail.smtp.port", "465");
            props.put("mail.smtp.socketFactory.port", SMTP_PORT);
            props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
            props.put("mail.smtp.socketFactory.fallback", "false");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.auth", "true");
            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {

                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });
            session.setDebug(true);
            Message msg = new MimeMessage(session);
            InternetAddress addressFrom = new InternetAddress(emailFrom);
            msg.setFrom(addressFrom);
            InternetAddress[] addressTo = new InternetAddress[sendTo.length];
            for (int i = 0; i < sendTo.length; i++) {
                addressTo[i] = new InternetAddress(sendTo[i]);
            }
            msg.setRecipients(Message.RecipientType.TO, addressTo);
            msg.setSubject(emailSubjectTxt);
            msg.setContent(emailMsgTxt, "text/plain");
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(emailMsgTxt);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            msg.setContent(multipart);
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(attachFilePath);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(attachFileName);
            multipart.addBodyPart(messageBodyPart);
            msg.setContent(multipart);
            msg.saveChanges();
            Transport.send(msg);
        } catch (MessagingException ex) {
            ret = false;
            ex.printStackTrace();
        }
        return ret;
    }

    public void trySendEmail() {

        final String host = "smtp.gmail.com";
        final int port = 587;
        final String username = "azntdc@gmail.com";
        final String password = "moonpasha";

        Properties props = new Properties();

        props.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
        session.setDebug(true);

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("sibtainpasha@gmail.com"));
            message.setSubject("Teste");
            message.setText("Bla, Bla, Bla!");

            Transport transport = session.getTransport("smtp");
            transport.connect(host, port, username, password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String args[]) throws Exception {

        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        SendEmail test = new SendEmail();
        test.trySendEmail();
        if (true) {
            return;
        }
        for (int i = 0; i < 1; i++) {
            test.emailSubjectTxt = "Testing Email";
            sendTo = new String[1];
            sendTo[0] = "sibtainpasha@gmail.com";
            SendEmail.emailMsgTxt = " this is testing email";
            attachFilePath = "D:\\";
            attachFileName = "test.pdf";
            test.sendEmail();
        }
        //   System.out.println("Successfully Sent mail to All Users");
    }
}
