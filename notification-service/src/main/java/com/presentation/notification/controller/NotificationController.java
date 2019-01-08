package com.presentation.notification.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    private static final Logger logger = LoggerFactory.getLogger(NotificationController.class);

    @RequestMapping(path = "/notify/{id}", method = RequestMethod.GET)
    public String notify(@PathVariable String id) {
        logger.info(String.format("notification %s is created", id));

        return "notification-created";
    }

}
