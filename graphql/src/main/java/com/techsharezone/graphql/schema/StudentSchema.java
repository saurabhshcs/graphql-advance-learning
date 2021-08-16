package com.techsharezone.graphql.schema;

/*
 * @created 13/08/2021 - 00:06
 * @project graphql
 * @author
 */

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public class StudentSchema {

    private String name;
    private Integer age;
    private BigDecimal salary;
}
