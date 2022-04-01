package com.levo.SpringLab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/employees/{id}")
    @ResponseBody
    public String getEmployeesById(@PathVariable String id) {
        return "ID:" + id;
    }

}
