package com.presentation.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
public class PaymentRestClient {

    @Autowired
    private RestTemplate restTemplate;

    public String notAvaliable(String id){
        return "payment-service not avaliable";
    }

    @HystrixCommand(fallbackMethod = "notAvaliable")
    public String createPayment(String id){
        if (new Random().nextInt() % 2 == 0)
            throw new RuntimeException("to fallback");

        return restTemplate.getForObject("http://payment-service/payment/"+ id, String.class);
    }
}
