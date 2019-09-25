package examples;

public class HelloWorldMessageProvider implements MessageProvider {
	
	private String message;
	private Persona usuario;		
	
    public void setMessage(String message) {
		this.message = message;
	}


	public String getMessage() {

        return message + " - " + 
        		usuario.getName() + " " + usuario.getLastName();
    }


	public void setUsuario(Persona usuario) {
		this.usuario = usuario;
	}

	
	
}