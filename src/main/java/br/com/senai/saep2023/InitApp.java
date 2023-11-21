package br.com.senai.saep2023;

import java.awt.EventQueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import br.com.senai.saep2023.view.ViewLogin;

@SpringBootApplication
public class InitApp {

	public static void main(String[] args) {		
		SpringApplicationBuilder builder = new SpringApplicationBuilder(InitApp.class);
		builder.headless(false);
		builder.run(args);
	}
	
	@Autowired
	private ViewLogin viewLogin;
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {		
		return args -> {			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {						
						viewLogin.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		};
	}

}
