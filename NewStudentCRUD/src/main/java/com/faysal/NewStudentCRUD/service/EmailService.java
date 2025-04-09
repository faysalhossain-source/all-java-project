package com.faysal.NewStudentCRUD.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faysal.NewStudentCRUD.utility.GmailServiceUtility;
import com.google.api.client.util.Base64;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.model.Message;

import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMessage.RecipientType;

@Service
public class EmailService {

	@Autowired
	private GmailServiceUtility gmailServiceUtility;

	public void sendEmail(String to, String subject, String bodyText)
			throws MessagingException, IOException, GeneralSecurityException {
		// Get Gmail service
		Gmail service = gmailServiceUtility.getGmailService();

		// Create email content
		Properties props = new Properties();
		Session session = Session.getDefaultInstance(props, null);
		MimeMessage email = new MimeMessage(session);

		email.setFrom(new InternetAddress("me")); // "me" is a special value for authorized user
		email.addRecipient(RecipientType.TO, new InternetAddress(to));
		email.setSubject(subject);
		email.setText(bodyText);

		// Encode and send the email
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		email.writeTo(buffer);
		byte[] bytes = buffer.toByteArray();
		String encodedEmail = Base64.encodeBase64URLSafeString(bytes);

		Message message = new Message();
		message.setRaw(encodedEmail);

		// Send the message
		service.users().messages().send("me", message).execute();
	}
}
