package org.accolite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("testannotationdi")
public class TestAnnotationDI {
    @Autowired // field injection
    @Qualifier("sms")
    MessageService messageService;

    // constructor
//    public TestAnnotationDI(@Qualifier("sms") MessageService messageService) {
//        this.messageService = messageService;
//    }

    public void testSendMessage() {
        messageService.sendMessage("test message", "ayuj@gmail.com");
    }
}
