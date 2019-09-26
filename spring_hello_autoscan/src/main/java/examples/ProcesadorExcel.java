package examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ProcesadorExcel")
public class ProcesadorExcel extends ProcesadorTexto{

	@Autowired						
	public ProcesadorExcel(
			LeerArchivo leeArchivoExcel, 
			Printer printerExcel, 
			Procesador procesaExcel
			) {
		
		super(leeArchivoExcel, printerExcel, procesaExcel);
		// TODO Auto-generated constructor stub
	}

	
	
}
