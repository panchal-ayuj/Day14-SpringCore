package org.accolite.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("sms")
public class SMSServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Inside SMSServiceImpl ... " + message + " : " + recipient);
    }
}
