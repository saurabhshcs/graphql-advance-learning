package com.techsharezone.graphql.service;
/*
 * @created 23/08/2021 -11:44
 * @project graphql
 * @author  saurabhshcs
 */

import com.techsharezone.graphql.entity.Student;
import com.techsharezone.graphql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public final Student getStudentByFirstName(final String firstName) {
        return studentRepository.findStudentByFirstName(firstName);
    }

    public
}
