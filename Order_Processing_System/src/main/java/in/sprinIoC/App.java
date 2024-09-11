package in.sprinIoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.springIoC.beans.OrderServiceImpl;
import in.springIoC.interfaces.OrderServices;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        
        OrderServiceImpl orderServices=context.getBean(OrderServiceImpl.class);
        orderServices.processOrder("Laptop");
        orderServices.processOrder("mobiple");
    }
}
