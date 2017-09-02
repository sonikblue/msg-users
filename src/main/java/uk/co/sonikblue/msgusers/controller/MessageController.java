package uk.co.sonikblue.msgusers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping(path = "/users")
    public String getMessages() {
        return "Hello, World!";
    }
}
