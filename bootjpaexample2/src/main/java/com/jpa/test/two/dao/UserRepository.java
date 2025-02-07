package com.jpa.test.two.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.two.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

//	public List<User> findByName(String name);
//	public List<User> findByNameAndGender(String name,String gender);
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
