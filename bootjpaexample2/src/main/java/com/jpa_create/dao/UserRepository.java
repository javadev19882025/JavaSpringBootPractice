package com.jpa_create.dao;

import org.springframework.data.repository.CrudRepository;
import com.jpa_create.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
