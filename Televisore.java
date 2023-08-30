package com.casa.esercitazione1.SecondaImplementazione.it;

public class Televisore extends ProdottoElettronico {

	
	public Televisore(String marca, String modello, double prezzo, String descrizione,Categoria categoriaProdotto) {
		super(marca, modello, prezzo, descrizione, categoriaProdotto);
		
		
	}

	    public String getName(String marca) {
	        return marca;
	    }

	    
	
	
}
