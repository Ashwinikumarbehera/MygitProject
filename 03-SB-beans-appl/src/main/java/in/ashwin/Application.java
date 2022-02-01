package in.ashwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.ashwin.util.EmailUtills;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		EmailUtills e = new EmailUtills();
		System.out.println(e);
	}

}
