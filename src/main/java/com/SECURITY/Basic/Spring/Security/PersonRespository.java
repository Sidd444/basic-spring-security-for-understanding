package com.SECURITY.Basic.Spring.Security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRespository extends JpaRepository<Person, Integer> {

    Person findByUserName(String userName);
}
