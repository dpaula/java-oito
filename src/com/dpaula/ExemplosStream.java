/**
 * 
 */
package com.dpaula;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author ferna
 *
 */
public class ExemplosStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//
		List<Curso> cursos = Arrays.asList(new Curso("Python", 45), new Curso("JavaScript", 150),
				new Curso("Java 8", 113), new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		// cursos.forEach(c -> System.out.println(c.getNome()));

		// mais de 100 alunos
		cursos.stream()/**/// usando stream, o mesmo retorna uma coleção para usar com vários métodos uteis
				.filter(c -> c.getAlunos() > 100)/**/// um dos métodos é o filter, para filtrar, retornando e stream
				.forEach(c -> System.out.println(c.getNome()));// depois só iterar pela lista ajustada

		System.out.println();

		// padrão usado nestes casos de retorno do mesmo tipo para uma novo método é
		// chamado de interface fluente,
		// com este padrão vc vai invocando o proximo método, sem precisar ficar
		// guardando em variavaeis

		// imprimir so a qtd de alunos
		cursos.stream()/**/
				.filter(c -> c.getAlunos() > 100)/**/
				.map(Curso::getAlunos)/**/// o map converte a lista em uma nova lista de acordo com a funcao, usando
											// reference
				.forEach(System.out::println);// imprimindo usando metodo reference

	}

}

class Curso {

	private String nome;
	private int alunos;

	/**
	 * @param nome
	 * @param alunos
	 */
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the alunos
	 */
	public int getAlunos() {
		return alunos;
	}

	/**
	 * @param alunos
	 *            the alunos to set
	 */
	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}

}
