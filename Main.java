package com.casa.esercitazione1.SecondaImplementazione.it; 
import java.util. *;

public class Main {

	public static Carrello amazonBasket = new Carrello(null, null, null,null);
	public static Catalogo catalogo = new Catalogo();

	public static Scanner tastiera = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		String inserimentoUtente1;
  
		mostraCatalogo();
		 
		do {

			Prodotto prodotto = null;

			do {
				prodotto = selezionaProdotto();
			}while(prodotto == null);

			int quantita = selezionaQuantita();


			Articolo articolo = new Articolo(prodotto , quantita);
			amazonBasket.aggiungiArticolo(articolo);

			System.out.println("Vuoi selezionare un altro prodotto? s/n");
			inserimentoUtente1 = tastiera.next();
			
			
		}while(inserimentoUtente1.equals("s"));

	
		
		amazonBasket.mostraRiepilogoCarrello();


	}






	private static int selezionaQuantita() {
		System.out.println("Scrivi la quantità del prodotto per aggiungerlo al carrello");
		int inserimentoUtente = tastiera.nextInt(); 
		return inserimentoUtente;
	}

	
	private static Prodotto selezionaProdotto() {
		System.out.println("Scrivi il codice del prodotto per aggiungerlo al carrello");
		int inserimentoUtente = tastiera.nextInt(); 
		return catalogo.trovaProdotto(inserimentoUtente);
	}

	
	private static void mostraCatalogo() {

		int codice = 0;

		List<Prodotto> ListaProdotti  = catalogo.getCatalogo();
		for (Prodotto x : ListaProdotti) {
			System.out.println(codice + " " + x);
			codice++;

		}
	}




}


