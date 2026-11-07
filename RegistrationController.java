package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    private final RegistrationService service;

    public RegistrationController(RegistrationService service) {
        this.service = service;
    }

    @GetMapping
    public List<Registration> get() {
        return service.getAll();
    }

    @PostMapping
    public Registration add(@RequestBody Registration r) {
        return service.add(r);
    }
}