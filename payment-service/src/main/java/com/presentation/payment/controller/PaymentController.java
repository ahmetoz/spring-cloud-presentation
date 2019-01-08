package com.presentation.payment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PaymentController {
    private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(path = "/payment/{id}", method = RequestMethod.GET)
    public String createPayment(@PathVariable String id) {
        logger.info(String.format("payment %s created", id));

        String result = restTemplate.getForObject("http://localhost:8083/notify/"+ id, String.class);
        logger.info(result);

        return "payment-created";
    }
}
