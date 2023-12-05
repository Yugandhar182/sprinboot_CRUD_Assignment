package com.springboot.crud.controller;

import com.springboot.crud.entity.Studentdata;
import com.springboot.crud.service.StudentdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private StudentdataService studentdataService;

    @GetMapping
    public String home(Model model) {
        try {
            Iterable<Studentdata> students = studentdataService.getAllStudents();
            model.addAttribute("students", students);
        } catch (Exception e) {
            e.printStackTrace();
            // Log the exception using a logger
            // Handle the exception appropriately
        }
        return "form";
    }

    @PostMapping("/submitform")
    public String saveData(
            @RequestParam int id,
            @RequestParam String firstname,
            @RequestParam String lastname,
            @RequestParam String email,
            @RequestParam String mobile,
            Model model) {

        // Create a new Studentdata instance with the received parameters
        Studentdata studentdata = new Studentdata(id, firstname, lastname, email, mobile);

        // Save the studentdata object using the service
        Studentdata savedStudent = studentdataService.saveStudent(studentdata);

        // Add the student data to the model for the "studentsdata.jsp" page
        model.addAttribute("student", savedStudent);

        return "studentsdata";
    }

    @GetMapping("/listusers")
    public String listUsers(Model model) {
        try {
            Iterable<Studentdata> students = studentdataService.getAllStudents();
            model.addAttribute("students", students);
            System.out.println(students);
        } catch (Exception e) {
            e.printStackTrace();
            // Log the exception using a logger
            // Handle the exception appropriately
            
        }
        
        return "listusers";
    }
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        try {
            studentdataService.deleteStudent(id);
        } catch (Exception e) {
            e.printStackTrace();
            // Log the exception using a logger
            // Handle the exception appropriately, e.g., display an error message
        }
        return "redirect:/listusers";
    }
}
