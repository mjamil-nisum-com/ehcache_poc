package com.infotech.book.ticket.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:app-config.xml")
public class TicketBookingManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingManagementApplication.class, args);
	}
}
