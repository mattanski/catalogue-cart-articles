package com.casa.esercitazione1.SecondaImplementazione.it;



public class Cliente {
	
	protected String nome;
	protected String cognome;
	protected int eta;
	protected String citta;
	protected String indirizzo;
	protected String codiceFiscale;
	
	
	public Cliente (String nome, String cognome, int eta,String citta, String indirizzo, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.citta = citta;
		this.indirizzo = indirizzo;
		this.codiceFiscale = codiceFiscale;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public String getCitta() {
		return citta;
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	
	
	
	public String toString() {
		
		String string;
		string = "\n" + this.nome + " " + this.cognome + "\nAnni: " + this.eta + "\nCitta: "+ this.citta + "\nIndirizzo: " +this.indirizzo + 
				"\nCodice Fiscale: " + this.codiceFiscale + "\n";
		
		return string;
	}
	
		
	
	
	
	

}
