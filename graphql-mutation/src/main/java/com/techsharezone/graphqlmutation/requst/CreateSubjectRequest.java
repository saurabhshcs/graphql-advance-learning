package com.techsharezone.graphqlmutation.requst;

/*
 * @created 31/08/2021 -01:10
 * @project graphql-mutation
 * @author  saurabhshcs
 */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateSubjectRequest {

    private String subjectName;

    private Double marksObtained;
}
