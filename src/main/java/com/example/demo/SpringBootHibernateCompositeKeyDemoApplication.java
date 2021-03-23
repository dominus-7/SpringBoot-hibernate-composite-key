package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeIdentity;
import com.example.demo.repositories.EmployeeRepository;

@SpringBootApplication
public class SpringBootHibernateCompositeKeyDemoApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateCompositeKeyDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Clear up all the tables
		employeeRepository.deleteAllInBatch();
		
		//employee object and insert in database
		Employee employee = new Employee(new EmployeeIdentity("B-12", "Sigma-24B"), "Ahmad", "impact@gmail.com", "774948645");
		this.employeeRepository.save(employee);
		
		this.employeeRepository.findById(new EmployeeIdentity("B-12", "Sigma-24B"));
		
		
	}

}
