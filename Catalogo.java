package com.casa.esercitazione1.SecondaImplementazione.it;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
	
 	private List<Prodotto> Catalogo;
	
	
  public Catalogo() {
	  
	  	Televisore televisore = new Televisore ("Samsung","GTX-RZ",720.00,"il televisore è un 62 pollici",Categoria.TELEVISORE);
	  	Smartphone smartphone = new Smartphone ("Lg","RST-HL",2340.50,"lo smartphone è dotato di entrata SD Card",Categoria.CELLULARE);
	  	Libro libro = new Libro ("Mondadori","Romanzo",12.00,"il libro è il più venduto su amazon",Categoria.LIBRO);
	  
	  	Catalogo = new ArrayList<>();
		
		
		
		Catalogo.add(televisore);
		Catalogo.add(smartphone);
		Catalogo.add(libro);
		
		
		
		
		
  }

  public List<Prodotto> getCatalogo() {
	 return Catalogo;
  }
  
  

  public Prodotto trovaProdotto(int inserimentoUtente) {
	return Catalogo.get(inserimentoUtente);
}
  
  


}
  
  
  
 

	
	

