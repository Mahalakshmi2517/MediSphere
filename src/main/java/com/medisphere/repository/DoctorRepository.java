package com.medisphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medisphere.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}