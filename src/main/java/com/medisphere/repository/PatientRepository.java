package com.medisphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medisphere.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}