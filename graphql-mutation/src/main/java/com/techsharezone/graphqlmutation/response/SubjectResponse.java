package com.techsharezone.graphqlmutation.response;

/*
 * @created 23/08/2021 -11:32
 * @project graphql
 * @author  saurabhshcs
 */

import com.techsharezone.graphqlmutation.entity.Subject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubjectResponse {
    private Long id;

    private String subjectName;

    private Double marksObtained;
    public SubjectResponse (Subject subject) {
        this.id = subject.getId();
        this.subjectName = subject.getSubjectName();
        this.marksObtained = subject.getMarksObtained();
    }
}
