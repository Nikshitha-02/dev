package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class RegistrationService {

    List<Registration> list = new ArrayList<>();

    public List<Registration> getAll() {
        return list;
    }

    public Registration add(Registration r) {
        list.add(r);
        return r;
    }
}
