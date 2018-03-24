package com.dpaula;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenarStrings {

	public static void main(String[] args) {

		List<String> nomes = Arrays.asList("Fernando de Paula de Lima", "Carla Weitzel", "Carmem Lucia", "Pamela");

		nomes.sort(new NomesSort());

		System.out.println(nomes);

		nomes.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});

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
