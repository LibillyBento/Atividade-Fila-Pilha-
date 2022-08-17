package br.edu.ifba.linked;

import java.util.LinkedList;
import java.util.Stack;

import br.edu.ifba.basica.Contato;

public class Fila {

	LinkedList<Contato> lista = new LinkedList<Contato>();

	public void inserir(Contato a) {
		lista.add(a);
	}

	public void verificar() {
		System.out.println(lista.size());

	}

	public void remover() {
		
		if (lista.isEmpty()) {
			System.out.println("A lista está vazia!");
		} else {
			System.out.println("O Elemento removido -->" + lista.removeLast());
		}
	}

	public void inverter() {
		
		Stack<Contato> f = new Stack<Contato>();

		for(int i = 0; i <= lista.size(); i++) {			
			f.push(lista.remove()); 
		}

		for (int i = 0; i <= f.size(); i++) {
			lista.add(f.pop());
			
		}
	}
	
	public void mostrar() {
		System.out.println(lista.toString());
	}

}
