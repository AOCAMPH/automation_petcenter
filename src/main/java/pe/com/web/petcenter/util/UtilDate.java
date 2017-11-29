package pe.com.web.petcenter.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDate {
	
	public String obtenerFechayHoraEjecucionTestCase()
	{
		Date fecha = new Date();
	    SimpleDateFormat ft = new SimpleDateFormat ("dd/mm/yyyy hh:mm:ss");
		return ft.format(fecha);
	}

}
