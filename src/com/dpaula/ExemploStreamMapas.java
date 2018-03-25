/**
 * 
 */
package com.dpaula;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ferna
 *
 */
public class ExemploStreamMapas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Curso> cursos = Arrays.asList(new Curso("Python", 45), new Curso("JavaScript", 150),
				new Curso("Java 8", 113), new Curso("C", 55));

		// transformando uma lista, em um mapa com stream
		Map<String, Integer> mapCursos = cursos.stream()/**/
				.collect(Collectors.toMap(Curso::getNome, Curso::getAlunos));// com Collectors.toMap basta passar quem
																				// será a chave e o valor, e o retorno
																				// será um map

		// para iteração de mapas, basta passar um BiConsumer
		// ou diretamente um lambda com dois parametros (chave, valor)
		mapCursos.forEach((nome, alunos) -> {
			System.out.println(nome + " tem " + alunos + " alunos");
		});

	}

}
