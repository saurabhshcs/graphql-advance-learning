package com.techsharezone.graphql.entity;

/*
 * @created 17/08/2021 -23:58
 * @project graphql
 * @author  saurabhshcs
 */

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @OneToOne(mappedBy = "address")
    private Student student;
}
