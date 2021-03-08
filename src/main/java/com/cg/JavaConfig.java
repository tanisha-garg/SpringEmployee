package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@PropertySource("classpath:employee.properties")
@ComponentScan("com.cg")
@Configuration
public class JavaConfig {
	
//	@Autowired
//	private Environment env;
//	private Employee emp;
//	
//	@Bean
//	public SBUBean getEmployee1() {
//		
//		String idS = env.getProperty("emp1.id");
//		Integer id1 = Integer.parseInt(idS);
//		String name1 = env.getProperty("emp1.name");
//		String salD = env.getProperty("emp1.sal");
//		Double sal1 = Double.parseDouble(salD);
//		String ageS = env.getProperty("emp1.age");
//		Integer age1 = Integer.parseInt(ageS);
//		
//		
//	}
	
}
