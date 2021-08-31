package com.techsharezone.graphqlmutation.entity;/*
 * @created 23/08/2021 -11:03
 * @project graphql
 * @author  saurabhshcs
 */


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String subjectName;

    @Column
    private Double marksObtained;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
