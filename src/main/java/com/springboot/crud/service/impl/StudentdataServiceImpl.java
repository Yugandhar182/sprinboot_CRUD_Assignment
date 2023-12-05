package com.springboot.crud.service.impl;

import com.springboot.crud.entity.Studentdata;
import com.springboot.crud.repositary.StudentdataRepository;
import com.springboot.crud.service.StudentdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentdataServiceImpl implements StudentdataService {

    @Autowired
    private StudentdataRepository studentdataRepository;

    @Override
    public Iterable<Studentdata> getAllStudents() {
        try {
            return studentdataRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            // Log the exception using a logger
            // Handle the exception appropriately
            return null; // or throw a custom exception
        }
    }

    @Override
    public Studentdata saveStudent(Studentdata studentdata) {
        try {
            return studentdataRepository.save(studentdata);
        } catch (Exception e) {
            e.printStackTrace();
            // Log the exception using a logger
            // Handle the exception appropriately
            return null; // or throw a custom exception
        }
    }
    @Override
    public void deleteStudent(int id) {
        try {
            studentdataRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            // Log the exception using a logger
            // Handle the exception appropriately, e.g., throw a custom exception
        }
    }

}
