package examples;

public class MesaagesByeRandom implements MessageProvider{

	@Override
	public String getMessage() {
		
		return "Bye " + Math.random();
		
	}
	
}
