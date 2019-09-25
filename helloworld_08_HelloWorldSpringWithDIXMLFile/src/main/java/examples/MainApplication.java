package examples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) throws Exception {

        // Spring Factory
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        MessageRenderer adios = (MessageRenderer) factory.getBean("rendererAdios");
        
        mr.render();
        adios.render();
        
        
    }

    private static BeanFactory getBeanFactory() throws Exception {
        // Configuración factory desde un beans XML
        BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
        return factory;
        
    }
}
