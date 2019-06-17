package com.shan.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.shan.model.Product;

public class ProductDao {

	private JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	  
	public List<Product> getAllProducts(){  
	 return template.query("select * from product",new ResultSetExtractor<List<Product>>(){  
	    public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {  
	      
	        List<Product> list=new ArrayList<Product>();  
	        while(rs.next()){  
	        Product p = new Product();
	        p.setProdcode(rs.getInt(1));
	        p.setDescription(rs.getString(2));
            p.setPrice(rs.getInt(3));
	        list.add(p);  
	        }  
	        return list;  
	        }  
	    });  
	  }  
	}  
	
