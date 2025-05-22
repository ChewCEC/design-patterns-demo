package com.example.DesignPatternsDemo.notifications;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    
    @GetMapping("/notify")
    public ResponseEntity<String> notify(@RequestParam String type, @RequestParam String message) {
        try {
            Notification notification = NotificationFactory.createNotification(type);
            notification.send(message);
            return ResponseEntity.ok("Notification sent");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
