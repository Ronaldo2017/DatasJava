package modulos_datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FaixaDeData {

	public static void main(String[] args) {
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2020-04-28"), LocalDate.now());
		System.out.println("Possuí " + dias + " dias entre a faixa de data");
		
	}

}
