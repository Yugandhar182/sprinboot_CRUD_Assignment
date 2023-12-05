package com.springboot.crud.service;

import com.springboot.crud.entity.Studentdata;

public interface StudentdataService {

    Iterable<Studentdata> getAllStudents();

    Studentdata saveStudent(Studentdata studentdata);
    void deleteStudent(int id);
}
