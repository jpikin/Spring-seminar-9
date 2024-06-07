package com.example.openFaign.proxy;

import com.example.openFaign.model.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "payments", url = "http://localhost:8093")
public interface PaymentProxy {
    @PostMapping("/payment")
    Payment pay(@RequestHeader String requestId, @RequestBody Payment payment);
}
