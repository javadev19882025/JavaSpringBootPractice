package com.jpa.CustomNativeFinder.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.jpa.CustomNativeFinder.entities.User;

@Repository
public interface UserRepositoryJPQL extends JpaRepository<User, Integer> {

//JPQL Query 1 

	@Query("select u FROM User u")
	public List<User> findallUsers();

//JPQL Query 2

	@Query("select u FROM User u Where u.name= :n and u.designation= :d")
	public List<User> getUsersByName(@Param("n") String name, @Param("d") String designation);

//JPQL Query 3

	@Query(value = "select * FROM user", nativeQuery = true)
	public List<User> getAllUsers();

}
