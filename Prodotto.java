package com.casa.esercitazione1.SecondaImplementazione.it;

public abstract class Prodotto implements EstensioneGaranzia{
		
		
		protected double prezzo;
		protected String descrizione;
		protected String marca;
		protected String modello;
		protected Categoria categoriaProdotto;
		
		
		public Prodotto(String marca,String modello,double prezzo,String descrizione,Categoria categoriaProdotto) {
			
			this.marca = marca;
			this.modello = modello;
			this.prezzo = prezzo;
			this.descrizione = descrizione;
			this.categoriaProdotto = categoriaProdotto;
		}
		
		double anni;
		public void aggiungiAnniGaranzia(double anni) {
			
			double anni1 = 10;
			double plus = (prezzo / 20*100) * anni1;
			
			double garanziaplus = prezzo + plus;
			System.out.println(garanziaplus);
		}


		public String toString() {
			
			String x = "";
			x += marca + " | " + modello + " | "+"Euro " + prezzo +  " | "+ categoriaProdotto + " | "+ descrizione ;
			return x;
		}



	
}
