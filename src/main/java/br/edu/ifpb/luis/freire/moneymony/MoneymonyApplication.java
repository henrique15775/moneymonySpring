package br.edu.ifpb.luis.freire.moneymony;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Component;
@SpringBootApplication
public class MoneymonyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneymonyApplication.class, args);
	}

}
