package com.solinfbroker.msemail.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.solinfbroker.msemail.dtos.EmailDTO;
import com.solinfbroker.msemail.models.EmailModel;
import com.solinfbroker.msemail.repository.EmailRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmailController {
    
    @Autowired
    private EmailRepository emailRepository;

    @PostMapping("/enviar-email")
    public ResponseEntity<EmailModel> enviarEmail(@RequestBody EmailDTO emailDTO) {
        EmailModel email = new EmailModel();
        BeanUtils.copyProperties(emailDTO, email);        
        return ResponseEntity.ok().body(emailRepository.save(email));
    }
    
}
