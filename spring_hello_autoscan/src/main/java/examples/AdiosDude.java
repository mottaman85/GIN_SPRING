package examples;

import org.springframework.stereotype.Component;

@Component
public class AdiosDude implements MessageProvider{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Bye";
	}
	
}
