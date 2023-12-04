package com.springboot.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.springboot.crud.entity.Studentdata;
import com.springboot.crud.repositary.StudentdataRepository;




@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private StudentdataRepository studentdataRepository;

    @GetMapping
    public String home() {
        return "form";
    }

    @PostMapping("/submitform")
    public String saveData(
            @RequestParam int id,
            @RequestParam String firstname,
            @RequestParam String lastname,
            @RequestParam String email,
            @RequestParam String mobile) {

        // Create a new Studentdata instance with the received parameters
        Studentdata studentdata = new Studentdata(id, firstname, lastname, email, mobile);

        // Save the studentdata object to the database
        Studentdata students=  studentdataRepository.save(studentdata);
    System.out.println(students);
        return "studentsdata";
    }
    
   

}
