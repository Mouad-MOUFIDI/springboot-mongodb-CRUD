package net.guides.springboot.crud;

import net.guides.springboot.crud.servicess.IEmplyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{
	@Autowired
	private IEmplyeeService emplyeeService;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		emplyeeService.initEmployees();
	}
}
