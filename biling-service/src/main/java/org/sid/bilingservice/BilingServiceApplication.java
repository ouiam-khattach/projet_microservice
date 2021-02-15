package org.sid.bilingservice;

import ch.qos.logback.core.CoreConstants;
import org.sid.bilingservice.entities.ProductItem;
import org.sid.bilingservice.feign.CustomerRESTClient;
import org.sid.bilingservice.feign.ProductItemRestClient;
import org.sid.bilingservice.model.Customer;
import org.sid.bilingservice.repository.BillRepository;
import org.sid.bilingservice.repository.ProductItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Collection;

@SpringBootApplication
@EnableFeignClients
public class BilingServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(BilingServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(BillRepository billRepository,
                            ProductItemRepository productItemRepository,
                            CustomerRESTClient customerRestClient,
                            ProductItemRestClient productItemRestClient
    ){
        return args ->{

            Customer customer = customerRestClient.getCustomerById(1L);
            System.out.println("--------------------------------");
            System.out.println(customer.getId());
            System.out.println(customer.getName());
            System.out.println(customer.getEmail());

        };
}
}
