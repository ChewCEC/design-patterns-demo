package com.example.DesignPatternsDemo.paymentsDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    
    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @GetMapping("/pay")
    public ResponseEntity<String> makePayment(@RequestParam String method, @RequestParam double amount) {
        paymentService.processPayment(amount, method);
        System.out.println("Method: "+method+"\nAmount: "+amount);
        return  ResponseEntity.ok("Payment processed");
    }

}
