package org.sid.bilingservice.feign;

import org.sid.bilingservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="CUSTOMER-SERVICE")
public interface CustomerRESTClient {
    @GetMapping(path="/customers/{id}")
    Customer getCustomerById(@PathVariable(name="id") Long id);

}
