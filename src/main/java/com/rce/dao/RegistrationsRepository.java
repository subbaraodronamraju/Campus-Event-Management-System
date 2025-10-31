package com.rce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rce.models.Registrations;

@Repository
public interface RegistrationsRepository extends JpaRepository<Registrations, Long> {

}
