/**
 * 
 */
package com.dpaula;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * @author ferna
 *
 */
public class ExemplosOptional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Curso> cursos = Arrays.asList(new Curso("Python", 45), new Curso("JavaScript", 150),
				new Curso("Java 8", 113), new Curso("C", 55));

		cursos.stream()/**/
				.filter(c -> c.getAlunos() > 100)/**/
				.findAny()/**/// busca qualquer um
				.ifPresent(c -> System.out.println(c.getNome()));/**/// como retorna um Optional, se o resultado não for
																		// nulo, executa o lambda

		System.out.println();

		// traz um optionalDouble
		OptionalDouble media = cursos.stream()/**/
				.filter(c -> c.getAlunos() > 1000)/**/
				.mapToDouble(c -> c.getAlunos())/**/// mapeia e traz uma lista de numeros
				.average();/**/// traz media

		System.out.println(media.orElse(0));
		System.out.println();

		cursos = cursos.stream()/**/
				.filter(c -> c.getAlunos() > 100)/**/
				.collect(Collectors.toList());// usando Collectors.toList() como recurso para retonrar a lista alterada

		cursos.forEach(c -> System.out.println(c.getNome()));
	}

}
