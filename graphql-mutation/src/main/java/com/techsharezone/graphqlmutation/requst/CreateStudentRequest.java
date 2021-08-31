package com.techsharezone.graphqlmutation.requst;

/*
 * @created 31/08/2021 -01:09
 * @project graphql-mutation
 * @author  saurabhshcs
 */

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateStudentRequest {

    private String firstName;

    private String lastName;

    private String email;

    private String street;

    private String city;

    private List<CreateSubjectRequest> subjectsLearning;
}
