package com.stackroute;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroute.dao.MentorDao;
import com.stackroute.model.Mentor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext ctx=new ClassPathXmlApplicationContext("mentor.xml");  
    	    MentorDao dao=(MentorDao)ctx.getBean("mdao");  
    	    List<Mentor> list=dao.getAllMentorsRowMapper();  
    	          
    	    for(Mentor m:list)  
    	        System.out.println(m);  
    	}  
    }
