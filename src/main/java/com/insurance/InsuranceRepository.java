package com.insurance;

import org.springframework.data.jpa.repository.JpaRepository;

// burası database de sorgu yapmaya yarıyor. entity sınıfının sorgularını yapıyor.
public interface InsuranceRepository extends JpaRepository<Insurance, String> {
}
