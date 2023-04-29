package modulos_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiasSemanaMesAno {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("Data atual: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " + date.getDayOfWeek().name());
		System.out.println("Dia do ano: " + date.getDayOfYear());
		
		
	}

}
