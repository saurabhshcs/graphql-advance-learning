package com.techsharezone.graphql.query;

/*
 * @created 23/08/2021 -11:49
 * @project graphql
 * @author  saurabhshcs
 */

import com.techsharezone.graphql.response.StudentResponse;
import com.techsharezone.graphql.service.StudentService;
import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class StudentQuery {

    @Autowired
    StudentService studentService;

    @GraphQLQuery(name = "searchStudentById")
    public StudentResponse searchStudentById(final Long id) {
        return new StudentResponse(studentService.getStudentByyId(id));
    }

    @GraphQLQuery(name = "firstQuery")
    public String firstQuery() {
        return "This is the first query";
    }
}
