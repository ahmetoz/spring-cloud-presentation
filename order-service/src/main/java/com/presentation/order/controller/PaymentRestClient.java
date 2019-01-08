package com.presentation.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentRestClient {

    @Autowired
    private RestTemplate restTemplate;

    public String notAvaliable(String id){
        return "payment-service not avaliable";
    }

    @HystrixCommand(fallbackMethod = "notAvaliable")
    public String createPayment(String id){
        return restTemplate.getForObject("http://localhost:8082/payment/"+ id, String.class);
    }
}
