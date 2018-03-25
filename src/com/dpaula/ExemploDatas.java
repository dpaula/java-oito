/**
 * 
 */
package com.dpaula;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * @author ferna
 *
 */
public class ExemploDatas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate nenen = LocalDate.of(2018, Month.OCTOBER, 30);

		Period periodo = Period.between(hoje, nenen);
		System.out.println(periodo.getMonths());

		System.out.println();

		// criando formatador de data
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatter.format(hoje));

		System.out.println();

		// Data com horas
		DateTimeFormatter fTime = DateTimeFormatter.ofPattern("dd/MM/yyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(fTime));

		System.out.println();

		// horas
		LocalTime hora = LocalTime.now();
		System.out.println(hora.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
	}

}
