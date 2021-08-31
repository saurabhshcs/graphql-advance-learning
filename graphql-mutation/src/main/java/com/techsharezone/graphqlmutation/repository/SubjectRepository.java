package com.techsharezone.graphqlmutation.repository;

/*
 * @created 30/08/2021 -02:18
 * @project graphql
 * @author  saurabhshcs
 */

import com.techsharezone.graphqlmutation.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
