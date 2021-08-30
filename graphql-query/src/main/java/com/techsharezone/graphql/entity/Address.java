package com.techsharezone.graphql.entity;

/*
 * @created 23/08/2021 -02:13
 * @project graphql
 * @author  saurabhshcs
 */

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String street;

    @Column
    private String city;

    @Column
    private String postcode;

    @OneToOne(mappedBy = "address")
    private Student student;
}