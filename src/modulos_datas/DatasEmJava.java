package modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();//pega data atual
	
		//simular q a data vem do bd
		calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("29/04/2023"));
		
		calendar.add(Calendar.DAY_OF_MONTH, 7);//data de hoje + 7 dias
		
		if(calendar.after(Calendar.DAY_OF_MONTH)) {
			System.out.println("Acesso negado");
		}else {
			System.out.println("Permitido");
		}
		
		System.out.println("Somando o dia: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		
		calendar.add(Calendar.MONTH, 1);
		
		System.out.println("Somando o mes " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
	}

}
