package com.devsuperior.hr.payroll.services;

import com.devsuperior.hr.payroll.entities.Payment;
import com.devsuperior.hr.payroll.entities.Worker;
import com.devsuperior.hr.payroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, Integer days){

        Worker worker = workerFeignClient.findById(workerId).getBody();

        return new Payment(worker.getName(),worker.getDailyIncome(), days);
    }

}
