package com.example.openFaign.controller;


import com.example.openFaign.model.Payment;
import com.example.openFaign.proxy.PaymentProxy;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PaymentController {

    private final PaymentProxy proxy;

    @PostMapping("/payment")
    public Payment addPay(@RequestBody Payment payment) {
        String requestId = "1";
        return proxy.pay(requestId, payment);
    }

}
