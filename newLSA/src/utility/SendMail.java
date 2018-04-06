package utility;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	public static void sendMail(String msg) {
		final String host = "smtp.gmail.com";
		final String username = "3006ravikumar@gmail.com"; //change to your Gmail username
		final String password = "54252GohanGoku"; //change to your Gmail password
		final String from = "3006ravikumar@gmail.com"; //change to from email address
		final String to = "concept4ravi@gmail.com"; //change to to email address
		//		final String cc = "test.cc.email@helloselenium.com"; //change to cc email address
		//		final String bcc = "test.bcc.email@helloselenium.com"; //change to bcc email address
		final String subject = "Server Report"; //change to your subject
//		final String filename = "/home/intern/git/Libsys_DTU/StudentNameUpdateScript/test-output/emailable-report.html";
		Properties props = new Properties();
		props.put("mail.smtps.host", host);
		props.put("mail.smtps.auth", true);
		props.put("mail.smtps.ssl.enable", "true");
		props.put("mail.smtps.starttls.enable", true);
		props.put("mail.smtps.port", "587");

		/*Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "25");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "25");
		props.put("mail.debug", "true");*/


		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to));
			/*
			//below code only requires if your want cc email address
			message.setRecipients(Message.RecipientType.CC,
					InternetAddress.parse(cc));
			//below code only requires if your want bcc email address
			message.setRecipients(Message.RecipientType.BCC,
					InternetAddress.parse(bcc));
			 */
			message.setSubject(subject);
			message.setText(msg);
			
			
			/*BodyPart messageBodyPart = new MimeBodyPart();

			messageBodyPart.setText("Here's the file");

			Multipart multipart = new MimeMultipart();

			multipart.addBodyPart(messageBodyPart);

			messageBodyPart = new MimeBodyPart();

			DataSource source = new FileDataSource(filename);

			messageBodyPart.setDataHandler(new DataHandler(source));

			messageBodyPart.setFileName(filename);

			multipart.addBodyPart(messageBodyPart);

			message.setContent(multipart);
*/
			System.out.println("Sending");
			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
