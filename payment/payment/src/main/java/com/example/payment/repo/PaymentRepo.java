package com.example.payment.repo;
import com.example.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<Payment,Integer> {
    Payment findByOrderId(int orderId);
}

