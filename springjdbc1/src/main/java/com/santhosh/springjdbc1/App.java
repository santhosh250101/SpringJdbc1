package com.santhosh.springjdbc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/santhosh/springjdbc1/config.xml");
    	
    	
    	JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
    	
    	String query="insert into product values(?,?,?)";
    	int x=template.update(query,1010,"mobile",4000);
    	System.out.println("Data inserted"+x);
    	
    	
    }
}
