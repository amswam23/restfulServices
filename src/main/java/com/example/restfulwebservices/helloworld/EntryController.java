package com.example.restfulwebservices.helloworld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {
    
    @GetMapping(path= "/home")
    public String hello() {
        System.out.print("Hello! Swami"); 
        return "Hello world Swami !!";

    }
}
