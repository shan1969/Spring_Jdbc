package com.sr.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sr.model.Customer;

public class CustomerDao {
	
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveCustomer(Customer c){  
	    String query="insert into customer values('"+c.getCustcode() +"','"+c.getCustname()+"','"+c.getAmount()+"')";  
	    return jdbcTemplate.update(query);  
	}  
	public int updateCustomer(Customer c){  
	    String query="update customer set custname='"+c.getCustname()+"', amount='"+c.getAmount()+"' where custcode='"+c.getCustcode()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteCustomer(Customer c){  
	    String query="delete from customer where custcode='"+c.getCustcode()+"' ";  
	    return jdbcTemplate.update(query);  
	}  

}
