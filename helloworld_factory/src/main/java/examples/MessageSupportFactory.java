package examples;

import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {
    
    private static MessageSupportFactory instance = null;   
    private Properties props = null; 
    private MessageRenderer renderer = null;
    private MessageProvider provider = null;
    
    private MessageSupportFactory() {
        props = new Properties();
        
        try {
        	String path = System.getenv("PATH_PROP");
        	System.out.println(path);
        	props.load(new FileInputStream(path));
            
        	        	
            // get the implementation classes
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");
            
            String testHello = props.getProperty("hola.mensaje");
            System.out.println(testHello);
            
            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    static {
        instance = new MessageSupportFactory();
    }
    
    public static MessageSupportFactory getInstance() {
        return instance;
    }
    
    public MessageRenderer getMessageRenderer() {
        return renderer;
    }
    
    public MessageProvider getMessageProvider() {
        return provider;
    }
    
}