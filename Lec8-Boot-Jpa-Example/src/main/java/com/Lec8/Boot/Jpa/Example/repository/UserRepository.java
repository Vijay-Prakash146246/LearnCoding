package com.Lec8.Boot.Jpa.Example.repository;

import com.Lec8.Boot.Jpa.Example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
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

   // Other Remaining  custom created method JPA repository interface
  // List<User> findByFirstNameAndLastName(String firstName, String lastName);
  // List<User> findByFirstNameOrLastName(String firstName, String lastName);
//   List<User> findByAgeBetween(int minAge, int maxAge);
//   //List<User> findByAgeLessThan(int maxAge);
//   List<User> findByAgeGreaterThan(int minAge);
//    List<User> findByLastNameIsNull();
//    List<User> findByLastNameIsNotNull();
//    List<User> findByFirstNameLike(String pattern);
//    List<User> findByFirstNameNotLike(String pattern);
//    List<User> findByAgeOrderByLastNameAsc(int age);
//    List<User> findByLastNameIgnoreCase(String lastName);
//    List<User> findByAgeIn(List<Integer> ages);
//
//    List<User> findByAgeNotIn(List<Integer> ages);
//    List<User> findByFirstNameStartingWith(String prefix);
//    List<User> findByLastNameEndingWith(String suffix);
//    List<User> findByFirstNameContaining(String substring);
//    List<User> findDistinctByLastName(String lastName);
//    List<User> findByLastNameNot(String lastName);
//    List<User> findByActiveTrue();
//
//    List<User> findByAdminFalse();
//    List<User> findByBirthDateAfter(LocalDate date);
//    List<User> findByJoiningDateBefore(LocalDate date);
 //   List<User> findByStartDateBetween(LocalDate startDate, LocalDate endDate);


    //L15 Executing JPQL and Native Queries with Spring Data JPA
    //@Query JPQL , native Query
    @Query("select u from User u")
    public List<User>getAllUser();
    //example of parametrized Query
    @Query("select u from User u WHERE u.name= :nam")
    public List<User>getAllUserByName(@Param("nam") String name);
    @Query("select u from User u WHERE u.name= :nam and u.city=:city")
    public List<User>getAllUserByNameAndCity(@Param("nam") String name,@Param("city") String city);

    //native query
    @Query(value = "select * from user ",nativeQuery = true )
    public  List<User> getUsers();

}
