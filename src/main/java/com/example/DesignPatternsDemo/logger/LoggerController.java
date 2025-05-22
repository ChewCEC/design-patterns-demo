package com.example.DesignPatternsDemo.logger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {

    @GetMapping("/log")
    public ResponseEntity<String> logMessage() {
        LoggerService logger = LoggerService.getInstance();
        logger.log("This is a log message");
        return ResponseEntity.ok("Log message sent\n");
    }
}
