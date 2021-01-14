package com.devsuperior.hr.payroll.services;

import com.devsuperior.hr.payroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, Integer days){
            return new Payment("Bob",100.0, days);
    }

}
