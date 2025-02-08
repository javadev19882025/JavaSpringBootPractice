package com.jpa.CustomFinder.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.jpa.CustomFinder.entities.User;

public interface UserRepositoryname extends JpaRepository<User, Integer> {

	public List<User> findByName(String name);
	//public List<User> findByNameAndGender(String name,String gender);
//	
//	@Query("select u FROM User u")	//JPQL Query 
//	public List<User> findallUsers();
//	
//	@Query("select u FROM User u Where u.name= :n and u.designation= :d")	//JPQL Query
//	public List<User> getUsersByName(@Param("n") String name,@Param("d")String designation);
//	
//	@Query(value="select * FROM user",nativeQuery = true)	//JPQL Query 
//	public List<User> getAllUsers();

}
