package com.example.DesignPatternsDemo.observer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    public UserController(){
        this.userService = new UserService();
        userService.registerObserver(new EmailObserver());
        userService.registerObserver(new SmsObserver());

    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestParam String username){
        userService.registerUser(username);
        return ResponseEntity.ok("User registered\n");
        
    }

}
