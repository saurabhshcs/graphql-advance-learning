package com.techsharezone.graphqlmutation.response;

/*
 * @created 23/08/2021 -11:32
 * @project graphql
 * @author  saurabhshcs
 */

import com.techsharezone.graphqlmutation.entity.Student;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class StudentResponse {
    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private String street;

    private String city;

    private List<SubjectResponse> learningSubjects;

    public StudentResponse(final Student student) {
        this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName  = student.getLastName();
        this.email = student.getEmail();

        this.street  = student.getAddress().getStreet();
        this.city = student.getAddress().getCity();

        if (student.getLearningSubjects() != null) {
            this.learningSubjects = new ArrayList<>();
            student.getLearningSubjects().forEach(subject -> learningSubjects.add(new SubjectResponse(subject)));
        }

    }
}
