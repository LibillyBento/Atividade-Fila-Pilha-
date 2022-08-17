package br.edu.ifba.principal;

import br.edu.ifba.basica.Contato;
import br.edu.ifba.linked.Fila;


public class Principal {

	public static void main(String[] args) {
		
		Fila lista = new Fila();
		
		Contato c = new Contato ("Líbilly", "1");
		Contato c1 = new Contato ("Alícia", "2");
		Contato c2 = new Contato ("Aaya", "3");

		
		lista.inserir(c);
		lista.inserir(c1);
		lista.inserir(c2);
		lista.mostrar();
		lista.inverter();
		lista.mostrar();

		

	
	}
	

}