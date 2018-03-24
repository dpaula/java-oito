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

		List<Curso> cursos = Arrays.asList(new Curso("Python", 45), new Curso("JavaScript", 150),
				new Curso("Java 8", 113), new Curso("C", 55));

		cursos.sort(Comparator.comparing(c -> c.getNome()));

		cursos.forEach(c -> System.out.println(c.getNome()));
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
