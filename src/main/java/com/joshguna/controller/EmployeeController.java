package com.joshguna.controller;

import com.joshguna.bootstrap.DataGenerator;
import com.joshguna.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String createEmployee(Model model) {

        model.addAttribute("employee", new Employee());
        model.addAttribute("states", DataGenerator.getAllStates());

        return "employee/employee-create";

    }

    @PostMapping("/list")
    public String employeeList(@Valid @ModelAttribute("employee") Employee employee, Model model) {

        //saving Employee
        DataGenerator.saveEmployee(employee);

        //Get all and bind list with view
        model.addAttribute("employees", DataGenerator.readAllEmployees());

        return "employee/employee-list";
    }


}
