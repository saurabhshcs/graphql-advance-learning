package com.techsharezone.graphql.repository;

/*
 * @created 23/08/2021 -10:59
 * @project graphql
 * @author  saurabhshcs
 */

import com.techsharezone.graphql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT * FROM Student WHERE first_name =? 1")
    Student findStudentByFirstName(@Param("firstName") String firstName);
}
