package com.jpa.CustomFinder.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.jpa.CustomFinder.entities.User;

public interface UserRepositorynamegender extends JpaRepository<User, Integer> {

	public List<User> findByNameAndGender(String name, String gender);

}
