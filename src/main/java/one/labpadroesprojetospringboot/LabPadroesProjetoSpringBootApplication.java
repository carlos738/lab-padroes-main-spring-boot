package one.labpadroesprojetospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringBootApplication.class, args);
	}

}
