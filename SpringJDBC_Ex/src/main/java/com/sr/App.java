package com.sr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sr.dao.CustomerDao;
import com.sr.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");  
        
        CustomerDao dao=(CustomerDao)ctx.getBean("cdao");  
      /*  int status=dao.saveCustomer(new Customer(102,"Amit",35000));  
        System.out.println(status);  */
              
        /*int status=dao.updateCustomer(new Customer(102,"Sonoo",15000)); 
        System.out.println(status);*/ 
          
              
        Customer c = new Customer(); 
        c.setCustcode(102);
        int status=dao.deleteCustomer(c); 
        System.out.println(status); 
          
    }  
      

    }

