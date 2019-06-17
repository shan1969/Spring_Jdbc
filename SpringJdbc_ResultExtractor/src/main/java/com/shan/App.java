package com.shan;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shan.dao.ProductDao;
import com.shan.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext ctx=new ClassPathXmlApplicationContext("product.xml");  
    	    ProductDao dao=(ProductDao)ctx.getBean("pdao");  
    	    List<Product> list=dao.getAllProducts();  
    	          
    	    for(Product p:list)  
    	        System.out.println(p);  
    	          
    	    }  
    }

