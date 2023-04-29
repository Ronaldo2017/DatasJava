package modulos_datas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FaixaDeTempo {

	public static void main(String[] args) throws InterruptedException {

//		LocalDate dataAntiga = LocalDate.of(2020, 8, 23);
//		
//		LocalDate dataNova = LocalDate.of(2023, 4, 29);
//		
//		System.out.println("Data antiga é maior que data nova: " + dataAntiga.isAfter(dataNova));
//
//		
//		//periodo
//		Period periodo = Period.between(dataAntiga, dataNova);
//		
//		System.out.println("Quanto dias: " + periodo.getDays());
//		
//		System.out.println("Período é: " + periodo.getDays() + " dias " + periodo.getMonths() + " meses e " + periodo.getYears()  + " anos ");
//	
		LocalDate dataBase = LocalDate.of(2020,8,23);
		
		
		System.out.println("Mais 7 dias: " + (dataBase = dataBase.plusDays(7)));
		
		System.out.println("Mais 7 anos: " + (dataBase = dataBase.plusYears(7)));
		
		for(int data = 1; data <= 12; data++) {
			dataBase.plusMonths(1);
			
			System.out.println("Data de vencimento: " + dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês: " + data);
		}
		
		
	}

}
