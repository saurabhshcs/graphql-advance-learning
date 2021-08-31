package com.techsharezone.graphqlmutation.repository;

/*
 * @created 23/08/2021 -11:01
 * @project graphql
 * @author  saurabhshcs
 */

import com.techsharezone.graphqlmutation.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
