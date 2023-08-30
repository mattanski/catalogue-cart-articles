package com.casa.esercitazione1.SecondaImplementazione.it;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Carrello {

	
	Cliente cliente;
	LocalDate dataOrdine;
	Prodotto prodotto;
	StatoOrdine stato;
	

	Cliente cliente1 = new Cliente ("Marco","Verdi",25,"Roma","Piazza Navona n.10","BBFBNM48S64C142Y");
	DataLocal data = new DataLocal();
	private List<Articolo> Carrello;
	
	
	public Carrello(Cliente cliente, LocalDate dataOrdine,Prodotto prodotto,StatoOrdine stato) {
		Carrello = new ArrayList<>();
		this.cliente = cliente;
		this.dataOrdine = dataOrdine;
		this.prodotto = prodotto;
		this.stato = stato;
	}
	
	public List<Articolo> getCatalogo() {
		return Carrello;
	}

	public void setCatalogo(List<Articolo> catalogo) {
		Carrello = catalogo;
	}

	public void aggiungiArticolo(Articolo articolo) {
		Carrello.add(articolo);
		
	}
	
	public void aggiungiCliente(Articolo articolo) {
		Carrello.add(articolo);
		
	}

	public void mostraRiepilogoCarrello() {
		System.out.println("ORDINE ZALANDO");
		System.out.println(StatoOrdine.SPEDITO);
		data.TodayDate();
		System.out.println(cliente1.toString());
		System.out.println();
		for (Articolo o : Carrello) {
			System.out.println(o);
	}
		
		

	

	
	}
}