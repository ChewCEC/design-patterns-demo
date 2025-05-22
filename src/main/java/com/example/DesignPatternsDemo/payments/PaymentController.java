// package com.example.DesignPatternsDemo.payments;

// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class PaymentController {
    
//     public ResponseEntity<String> processPayment(@RequestParam String method, @RequestParam double amount ) {
//         PaymentStrategy paymentStrategy = getPaymentStrategy(method);
//         if (paymentStrategy == null) {
//             return ResponseEntity.badRequest().body("Invalid payment method");
//         }
//         paymentStrategy.pay(amount);
//         return ResponseEntity.ok("Payment processed successfully");
//     }



//     private PaymentStrategy getPaymentStrategy(String method) {
//         return 
//         switch (method.toUpperCase()) {
//             case "PAYPAL" -> new PayPalPay();
//             case "CREDIT_CARD" -> new CreditCardPay();
//             default -> null;
//         };  
//     }

// }
