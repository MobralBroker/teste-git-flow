package com.solinfbroker.msemail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solinfbroker.msemail.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
    
}
