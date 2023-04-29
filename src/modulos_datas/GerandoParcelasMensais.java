package modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GerandoParcelasMensais {
	
	public static void main(String[] args) throws ParseException {
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("21/04/2023");
		
		Calendar calendar =  Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		
		for (int parcela = 1; parcela <= 5; parcela++) {
			//adicioana o mes, e acrescenta mais 1 mes
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela número: " + 
					parcela + " vencimento em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
		
//		
//		for(int fim = 1; fim <= 7; fim++) {
//			calendar.add(Calendar.DAY_OF_MONTH, 7);
//			
////			System.out.println("Acesso negado!");
//		}
		System.out.println("Acesso negadoooooooooooooooooooo!");
	}

}
