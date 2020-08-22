package com.axproject.axwebproject.controller;

import com.axproject.axwebproject.model.TestUser;
import com.axproject.axwebproject.repository.TestUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class TestController {

    @Autowired
    private TestUserRepository repository;

    @GetMapping("/test")
    public String testController(Model model) {

        TestUser user = repository.getById(0L);

        model.addAttribute("username", user.getUsername());

        return "test";
    }

}
