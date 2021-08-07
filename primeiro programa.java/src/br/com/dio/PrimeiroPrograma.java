package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		/*System.out.println("Hello World!");*/
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
	}

}

class Livros{
	private String nome;
	private String npag;
}