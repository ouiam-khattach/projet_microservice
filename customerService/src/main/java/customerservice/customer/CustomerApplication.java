package customerservice.customer;

import customerservice.customer.entites.Customer;
import customerservice.customer.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerApplication.class, args);
    }


    @Bean
    CommandLineRunner start(CustomerRepository customerRepository,
                            RepositoryRestConfiguration repositoryRestConfiguration){
                            repositoryRestConfiguration.exposeIdsFor(Customer.class);

        return args -> {
            customerRepository.save(new Customer(null, "ouiam", "ouiamkhattach@gmail.com"));
            customerRepository.save(new Customer(null, "houda", "houdakhattach@gmail.com"));
            customerRepository.findAll().forEach(c -> {
                System.out.println(c.toString());
            });


        };

    }}
