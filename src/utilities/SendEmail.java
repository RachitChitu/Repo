package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;

// Java program to send email 
// with HTML templates 

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

import org.apache.commons.io.IOUtils;

import javax.mail.Session;
import javax.mail.Transport;

public class SendEmail {

	public static void main(String[] args) {
	try {
		sendEmail();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@SuppressWarnings("deprecation")
	public static void sendEmail() throws FileNotFoundException, IOException {
		// email ID of Recipient.
		String recipient = "rachit@relfor.com";

		// email ID of Sender.
		String sender = "AutomationDaemon<sinharachit.chitu@gmail.com>";

		// Getting system properties
		Properties properties = System.getProperties();

		// Setting up mail server
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.auth", "true");

		// creating session object to get properties
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("rachit@relfor.com", "relfor@123");
			}
		});

		try {
			// MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From Field: adding senders email to from field.
			message.setFrom(new InternetAddress(sender));

			// Set To Field: adding recipient's email to from field.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));

			// Set Subject: subject of the email
			message.setSubject("Automation Report ");

			StringWriter writer = new StringWriter();
			IOUtils.copy(new FileInputStream(new File("C:\\Users\\Guest User\\eclipseworkspace\\BAKEWAY_WEBSITE\\test-output\\emailable-report.html")),writer);

			// set body of the email.
			message.setContent(writer.toString(), "text/html");

			// Send email.
			Transport.send(message);
			System.out.println("Mail successfully sent");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}