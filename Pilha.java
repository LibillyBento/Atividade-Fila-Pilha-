package br.edu.ifba.pilha;

import java.util.Stack;

import br.edu.ifba.basica.Contato;

public class Pilha {
	Stack<Contato> p = new Stack<Contato>();

	public void inserir(Contato c) {

		p.push(c);

	}

	public void remover() {

		p.pop();

	}

	public void verificar() {

		System.out.println(p.size());

	}

	public void mostrar() {

		System.out.println(p.toString());

	}
}
