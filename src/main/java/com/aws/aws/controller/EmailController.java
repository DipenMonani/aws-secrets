package com.aws.aws.controller;

import com.aws.aws.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Value("${aws.to.email.address}")
    private String toEmailAddress;

    @Autowired
    EmailService emailService;

    @GetMapping("/send")
    public String sendEmail(){
        try {
            String subject = "Amazon SMTP Testing Email";
            String content = "<p>Hi there, this is a test email.</p>";
            emailService.sendEmail(toEmailAddress, subject, content);
        } catch ( UnsupportedEncodingException e) {
            System.out.println(e.getStackTrace());
            return "Email sending fail..";
        }
        return "Email sending success..";
    }
}
