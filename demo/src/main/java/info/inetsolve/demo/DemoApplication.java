package info.inetsolve.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
@Autowired
	private DemoServices demoServices;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@PostConstruct
public void saveempdata() {
	demoServices.saveempdata(new Employee("sekhar" ,"511R","200000f"));
}
}
