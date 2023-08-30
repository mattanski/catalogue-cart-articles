package com.casa.esercitazione1.SecondaImplementazione.it;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DataLocal {

		public void TodayDate() {
			
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
	String dataDiOggi = LocalDateTime.now().format(formatter);
	
	System.out.println("La data dell'ordine è : " + dataDiOggi);
	}
}
	
	

