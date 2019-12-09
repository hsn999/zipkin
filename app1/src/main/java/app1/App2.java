package app1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app1.com.FactoryBeanService;
import app1.com.MyMapperScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@MyMapperScan(value = "test")
public class App2
{
	@Autowired
	FactoryBeanService factoryBeanService;
	
	public static void main( String[] args )
    {
        SpringApplication.run(App2.class, args);
        
    }
	
	
}
