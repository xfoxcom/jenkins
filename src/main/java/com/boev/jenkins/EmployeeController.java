package com.boev.jenkins;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @GetMapping("/employees")
    public String showAllEmployees() {
        return "Hello from Jenkins";
    }


}
