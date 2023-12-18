package org.accolite.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Inside EmailServiceImpl ... " + message + " : " + recipient);
    }
}
