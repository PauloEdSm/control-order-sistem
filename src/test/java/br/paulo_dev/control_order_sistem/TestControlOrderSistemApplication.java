package br.paulo_dev.control_order_sistem;

import org.springframework.boot.SpringApplication;

public class TestControlOrderSistemApplication {

	public static void main(String[] args) {
		SpringApplication.from(ControlOrderSistemApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
