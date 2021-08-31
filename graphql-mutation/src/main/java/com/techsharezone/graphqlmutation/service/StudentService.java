package com.techsharezone.graphqlmutation.service;
/*
 * @created 23/08/2021 -11:44
 * @project graphql
 * @author  saurabhshcs
 */

import com.techsharezone.graphqlmutation.entity.Address;
import com.techsharezone.graphqlmutation.entity.Student;
import com.techsharezone.graphqlmutation.entity.Subject;
import com.techsharezone.graphqlmutation.repository.AddressRepository;
import com.techsharezone.graphqlmutation.repository.StudentRepository;
import com.techsharezone.graphqlmutation.repository.SubjectRepository;
import com.techsharezone.graphqlmutation.requst.CreateStudentRequest;
import com.techsharezone.graphqlmutation.requst.CreateSubjectRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    StudentRepository studentRepository;

    public final Student getStudentByFirstName(final String firstName) {
        return studentRepository.findStudentByFirstName(firstName);
    }

    public final Student createStudent(final CreateStudentRequest request){
        Student student = new Student(request);

        Address address = new Address();
        address.setStreet(request.getStreet());
        address.setCity(request.getCity());

        address = addressRepository.save(address);

        student.setAddress(address);
        student = studentRepository.save(student);


        List<Subject> subjectsList = new ArrayList<Subject>();
        if(request.getSubjectsLearning() != null) {
            for (CreateSubjectRequest createSubjectRequest :
                    request.getSubjectsLearning()) {
                Subject subject = new Subject();
                subject.setSubjectName(createSubjectRequest.getSubjectName());
                subject.setMarksObtained(createSubjectRequest.getMarksObtained());
                subject.setStudent(student);

                subjectsList.add(subject);
            }

            subjectRepository.saveAll(subjectsList);

        }

        student.setLearningSubjects(subjectsList);

        return student;
    }
}