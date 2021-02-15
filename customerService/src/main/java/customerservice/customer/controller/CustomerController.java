package customerservice.customer.controller;

import customerservice.customer.repository.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public String Customers(Model model){
        model.addAttribute("customers",customerRepository.findAll());
                return "customers-list";
    }
}
