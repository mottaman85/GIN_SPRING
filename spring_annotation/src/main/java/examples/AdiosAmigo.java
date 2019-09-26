package examples;

import org.springframework.stereotype.Component;

@Component
public class AdiosAmigo implements MessageProvider{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Adios";
	}
	
}
