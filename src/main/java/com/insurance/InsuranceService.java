package com.insurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceService {

    @Autowired
    InsuranceRepository insuranceRepository;

    public void save(Insurance insurance) {

        insuranceRepository.save(insurance);
    }

    public List<Insurance> findAll() {

        return insuranceRepository.findAll();
    }
}
