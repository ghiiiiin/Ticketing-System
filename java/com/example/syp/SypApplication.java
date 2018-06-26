package com.example.syp;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootApplication
public class SypApplication {

	public static void main(String[] args) {
		SpringApplication.run(SypApplication.class, args);
	}
	
	@Bean
	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);
		mailSender.setUsername("ghina.otaku@gmail.com");
		mailSender.setPassword("@kokoronomoto");
		Properties p = mailSender.getJavaMailProperties();
		p.put("mail.transport.protocol", "smtp");
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.starttls.enable","true");
		p.put("mail.debug", "true");
		return mailSender;
	}

	
	@Bean
	public SimpleMailMessage getTemplate () {
		SimpleMailMessage mess = new SimpleMailMessage();
		mess.setText("o what's up %s");
		return mess;
	}
}

