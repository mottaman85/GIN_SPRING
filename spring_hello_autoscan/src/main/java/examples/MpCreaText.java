package examples;

import org.springframework.stereotype.Component;

@Component
public class MpCreaText implements MessageProvider{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Soy crea Text";
	}
	
}
