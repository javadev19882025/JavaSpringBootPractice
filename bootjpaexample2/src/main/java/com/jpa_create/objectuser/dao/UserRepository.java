package com.jpa_create.objectuser.dao;


import org.springframework.data.repository.CrudRepository;
import com.jpa_create.objectuser.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {


}
