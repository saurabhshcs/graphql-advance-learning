package com.techsharezone.graphql.query;

/*
 * @created 13/08/2021 - 00:03
 * @project graphql
 * @author saurabhhscs
 */

import com.techsharezone.graphql.schema.StudentSchema;
import graphql.kickstart.tools.GraphQLQueryResolver;
import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
@RequiredArgsConstructor
public class StudentQuery implements GraphQLQueryResolver {

    @GraphQLQuery(name = "StudentQuery")
    public StudentSchema getStudent() {

        return StudentSchema.builder().name("Saurabh").age(36).salary(BigDecimal.TEN).build();
    }
}
