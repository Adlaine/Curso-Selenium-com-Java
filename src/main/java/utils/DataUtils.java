package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtils {
	
	public static Date obterDataComDiferencaDias(int dias) {
		Calendar calendar = Calendar.getInstance();// armazena a data atual na variavel
			calendar.add(Calendar.DAY_OF_WEEK, dias);// para adicionar dias na data atual
			return calendar.getTime();// retorna o dia com incremento ou decremento de dos dia passado via parametro
			
	}
	
	public static String obterDataFormatada(Date data) {
		DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
		return format.format(data);
	}

}
