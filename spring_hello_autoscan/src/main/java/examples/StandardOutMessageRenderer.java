package examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("renderer")   // This is the same as @Component(value="renderer")
public class StandardOutMessageRenderer implements MessageRenderer {

	MessageProvider mpc;
	
	@Autowired
	private ProcesadorExcel excel;
	
	
	@Autowired	
	public StandardOutMessageRenderer(MessageProvider adiosDude) {
		System.out.println("Creator: " + adiosDude.getMessage());
	}
	
	
	@Autowired	
    private MessageProvider helloWorldMessageProvider = null;

    public void render() {
        if (helloWorldMessageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }

        System.out.println(helloWorldMessageProvider.getMessage());
        System.err.println(mpc.getMessage());
        excel.execute();
    }
    
    @Autowired
    public void creaText(MessageProvider mpCreaText) {
    	mpc = mpCreaText;
    	
    	
    }
    


    // Not needed anymore since it will be autowired
//    public void setMessageProvider(MessageProvider provider) {
//        this.messageProvider = provider;
//    }

}