package com.agri.mes.production_service;

import com.agri.mes.production_service.info.ProductionServiceInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {ProductionServiceInfo.class})
public class ProductionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductionServiceApplication.class, args);
	}

}
