package com.techsharezone.graphqlmutation.mutation;

/*
 * @created 31/08/2021 -00:50
 * @project graphql-mutation
 * @author  saurabhshcs
 */

import com.techsharezone.graphqlmutation.requst.CreateStudentRequest;
import com.techsharezone.graphqlmutation.response.StudentResponse;
import com.techsharezone.graphqlmutation.service.StudentService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    StudentService service;

    public StudentResponse createStudent(final CreateStudentRequest request) {
        return new StudentResponse(service.createStudent(request));
    }
}
