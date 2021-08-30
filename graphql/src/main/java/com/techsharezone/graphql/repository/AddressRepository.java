package com.techsharezone.graphql.repository;

/*
 * @created 23/08/2021 -11:01
 * @project graphql
 * @author  saurabhshcs
 */

import com.techsharezone.graphql.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
