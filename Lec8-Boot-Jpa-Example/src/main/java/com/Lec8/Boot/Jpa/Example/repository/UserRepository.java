package com.Lec8.Boot.Jpa.Example.repository;

import com.Lec8.Boot.Jpa.Example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
    //custom  finder method OR derived query methods
    public List<User> findByName(String name);
    public List<User> findByNameAndCity(String name, String city);
    public List<User> findByNameStartingWith(String name);
   public List<User> findByNameEndingWith(String name);
    public List<User> findByNameContaining(String name);
    public List<User> findByNameLike(String name); //not working
    public List<User> findByAgeLessThan(int age);
    public List<User> findByAgeGreaterThanEqual(int age);
    public List<User> findByAgeIn(Collection<Integer> ages);
    public List<User> findByNameOrderByAgeAsc(String name);
}
