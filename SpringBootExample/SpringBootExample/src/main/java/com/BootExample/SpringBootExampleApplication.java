package com.BootExample;


import com.BootExample.Controller.CustomerLoginController;
import com.BootExample.Exception.HnDBankException;
import com.BootExample.Model.CustomerLoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@SpringBootApplication
public class SpringBootExampleApplication implements CommandLineRunner {


	private static final Log LOGGER = LogFactory.getLog(SpringBootExampleApplication.class);
	@Autowired
	CustomerLoginController customerLoginController;

	@Autowired
	Environment environment;


	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		try{
			CustomerLoginDTO customerLogin = new CustomerLoginDTO();
			customerLogin.setLoginName("harryz");
			customerLogin.setPassword("harry1234");
			customerLoginController.authenticateCustomer(customerLogin);

			LOGGER.info(environment.getProperty("SUCCESS"));
		}catch(HnDBankException exception){
			LOGGER.error(environment.getProperty(exception.getMessage()));
		}
	}

}
