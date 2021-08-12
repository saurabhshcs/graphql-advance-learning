package com.techsharezone.graphql.query;

/*
 * @created 13/08/2021 - 00:03
 * @project graphql
 * @author saurabhhscs
 */

import com.techsharezone.graphql.schema.StudentSchema;
import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
@Slf4j
@RequiredArgsConstructor
public class StudentQuery{

    @GraphQLQuery(name = "StudentQuery")
    public CompletableFuture<StudentSchema> getStudent() {

        StudentSchema studentSchema;

        return null;
    }

}
