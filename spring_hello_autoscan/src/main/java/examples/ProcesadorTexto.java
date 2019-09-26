package examples;

public abstract class ProcesadorTexto {

	private LeerArchivo lee;
	private Printer printer;
	private Procesador procesa;
	
	public ProcesadorTexto(
			LeerArchivo lee, 
			Printer printer,
			Procesador procesa) {
		
	}
	
	public void execute() {
		
		lee.leer();
		procesa.procesa();
		printer.print();
	
	}
	
}
