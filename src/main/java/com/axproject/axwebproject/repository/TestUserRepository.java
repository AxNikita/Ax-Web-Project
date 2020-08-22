package com.axproject.axwebproject.repository;

import com.axproject.axwebproject.model.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestUserRepository extends CrudRepository<TestUser, Long> {

    TestUser getById(Long id);

}
