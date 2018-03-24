package com.dpaula;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrdenarStrings {

	public static void main(String[] args) {

		List<String> nomes = Arrays.asList("Fernando de Paula de Lima", "Carla Weitzel", "Carmem Lucia", "Pamela");

		nomes.sort(new NomesSort());

		// lambda
		// pega esta função como parametro e transforma em uma interface funcional
		// neste caso no método campare da interface Comparator
		nomes.sort((s1, s2) -> {

			if (s1.length() < s2.length()) {
				return -1;
			}

			if (s1.length() > s2.length()) {
				return 2;
			}

			return 0;
		});

		// utilizando metodo compare da api Integer que compara dois valores, e rotorna
		// 1, -1 e 0
		// basta passar para lambda que vai entender e converter em um comparator
		nomes.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(nomes);

		nomes.forEach(s -> System.out.println(s));

	}
}

class NomesSort implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		if (s1.length() < s2.length()) {
			return -1;
		}

		if (s1.length() > s2.length()) {
			return 2;
		}

		return 0;
	}

}
