package examples;

public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider = null;

    public StandardOutMessageRenderer(){
    	System.out.println("instancia nueva...");
    }
    
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }

        System.out.println(messageProvider.getMessage());
    }

    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

}