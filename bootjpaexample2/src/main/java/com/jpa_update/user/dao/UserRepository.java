package com.jpa_update.user.dao;


import org.springframework.data.repository.CrudRepository;
import com.jpa_update.user.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {


}
