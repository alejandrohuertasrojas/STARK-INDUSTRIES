package com.Avengers.Ciclo3;


import com.Avengers.Ciclo3.modelos.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication (exclude ={SecurityAutoConfiguration.class})
public class Mark1Application {

	@GetMapping("/hello")
	public String hello(){
		return "Hola Ciclo 3... Saldremos vivos de esto!";
	}

	@GetMapping("/test")
	public String test(){
		Empresa emp = new Empresa("Stark Industries", "890 Quinta Avenida Manhattan", "3123123121", "800123456-7");
		emp.setNombre("Stark LTDA");
		return emp.getNombre();
	}

	public static void main(String[] args) {
		SpringApplication.run(Mark1Application.class, args);
	}

}
