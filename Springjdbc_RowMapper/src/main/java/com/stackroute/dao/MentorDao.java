package com.stackroute.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.stackroute.model.Mentor;

public class MentorDao {

		private JdbcTemplate template;  
		  
		public void setTemplate(JdbcTemplate template) {  
		    this.template = template;  
		}  
		  
		public List<Mentor> getAllMentorsRowMapper(){  
		 return template.query("select * from mentor",new RowMapper<Mentor>(){  
		    public Mentor mapRow(ResultSet rs, int rownumber) throws SQLException {  
		       Mentor m = new Mentor();
		       m.setMentorid(rs.getInt(1));
		       m.setMentorname(rs.getString(2));
		       m.setCourse(rs.getString(3));
		        return m;  
		    }

			
		    });  
		}  
		}  

