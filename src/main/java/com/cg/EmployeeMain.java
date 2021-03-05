package com.cg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

    public static void main(String args[]){
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
        context.register(JavaConfig.class);
        context.refresh();
        Employee employee= context.getBean(Employee.class);
        System.out.println("Id: "+employee.getEmployeeId()+" Name: "+employee.getEmployeeName()+" Salary: "
				+employee.getSalary()+" Age: "+employee.getAge()+" "+employee.getBusinessUnit());
        
        SBUBean sbu = context.getBean(SBUBean.class);
        System.out.println("SbuId: "+sbu.getSbuId()+" SbuHead: "+sbu.getSbuHead()+" SbuName: "+sbu.getSbuName());


    }

}
