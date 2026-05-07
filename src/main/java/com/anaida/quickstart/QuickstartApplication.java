package com.anaida.quickstart;

import ch.qos.logback.classic.Logger;
import com.anaida.quickstart.config.PizzaConfig;
import com.anaida.quickstart.services.ColourPrinter;
import com.anaida.quickstart.services.impl.ColourPrinterImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class QuickstartApplication implements CommandLineRunner {
	/* 1 : Printer example for explaining config file and beans
	private ColourPrinter colourPrinter;

	public QuickstartApplication(ColourPrinter colourPrinter){
		this.colourPrinter = colourPrinter;
	}
	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
	}

	public void run(final String... args){
		System.out.println(colourPrinter.print());
	}
	// It means: this method can accept zero or more String arguments, instead of a fixed number.
	//So your method:
	//public void run(final String... args)
	//is essentially treated like:
	//public void run(final String[] args)
	*/


	/* 2: environment vriables as beans using Pizza Config in whihc we use configurtionProperties annotation
	private PizzaConfig pizzaConfig;

	public QuickstartApplication(PizzaConfig pizzaConfig){
		this.pizzaConfig = pizzaConfig;
	}
	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
	}

	@Override
	public void run(final String... args){
		//final PizzaConfig pizzaConfig = new PizzaConfig("tomato","mozzarella","thin");

		System.out.println(
				String.format("I want a %s crust pizza, with %s and %s sauce",
						pizzaConfig.getCrust(),
						pizzaConfig.getTopping(),
						pizzaConfig.getSauce()
				)

		);
	}

	 */


	private final DataSource dataSource;

	public QuickstartApplication(final DataSource dataSource){
		this.dataSource = dataSource;
	}
	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
	}

	@Override
	public void run(final String... args){
		System.out.println("DataSource: "+dataSource.toString());
		final JdbcTemplate restTemplate = new JdbcTemplate(dataSource);
		restTemplate.execute("select 1");
	}


}
