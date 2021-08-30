package com.techsharezone.graphql.query;

/*
 * @created 24/08/2021 -12:40
 * @project graphql
 * @author  saurabhshcs
 */

import com.techsharezone.graphql.requst.SampleRequest;
import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class Query {

    @GraphQLQuery(name = "firstQuery")
    public String firstQuery(){
        return "First Query";
    }

    @GraphQLQuery(name = "secondQuery")
    public String scondQuery(){
        return "Second Query";
    }

    @GraphQLQuery(name = "fullName")
    public String fullName(SampleRequest sampleRequest){
        return sampleRequest.getFirstName() +  " - " + sampleRequest.getLastName();
    }

}
