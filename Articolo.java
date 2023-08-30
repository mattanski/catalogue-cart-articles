package com.casa.esercitazione1.SecondaImplementazione.it;

public class Articolo  {
	
	 Prodotto prodotto;
	 int quantita;
	 
	 
		public Articolo(Prodotto p,int quantita) {
		
		 this.prodotto = p;
		 this.quantita = quantita;
		
	 }

		
		public String toString() {
			
			String j = "";
			j +=   "| "+ quantita + " | " + prodotto ;
			return j;
		}
	 
	 
}
