package com.presentation.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private PaymentRestClient paymentRestClient;

    @RequestMapping(path = "/orders/{id}", method = RequestMethod.GET)
    public String createOrder(@PathVariable String id) {
        logger.info(String.format("order %s created", id));

        String result = paymentRestClient.createPayment(id);
        logger.info(result);

        return "order-created";
    }
}
