package com.Lec8.Boot.Jpa.Example;

import com.Lec8.Boot.Jpa.Example.model.User;
import com.Lec8.Boot.Jpa.Example.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Lec8BootJpaExampleApplication
{
	public static void main(String[] args)
	{
		ApplicationContext context= SpringApplication.run(Lec8BootJpaExampleApplication.class, args);
		UserRepository repository1 = context.getBean(UserRepository.class);
//		User user=new User();
//		user.setName("Vijay Prakash Singh");
//		user.setCity("Nawada , Bihar");
//		user.setStatus("I am java programmer");
//
//		User user1=new User();
//		user1.setName("Vijay Prakash");
//		user1.setCity("Nawada");
//		user1.setStatus("I am a programmer");
//		//saving single user
//		repository1.save(user1);
//		System.out.println("Saved User : "+user1);
//		//saving single user
//		repository1.save(user);
//		System.out.println("Saved User : "+user);
//
//
//
//		//L13 CRUD Operation using JPA and Spring Boot
//		//save multiple object
//		List<User>users=List.of(user1,user);
//		Iterable<User>result = repository1.saveAll(users);
//		result.forEach(
//				user2 -> {
//					System.out.println(user2);
//				}
//		);
//
//
//		//update the user of id 2
//		Optional<User> user2 = repository1.findById(2);
//		user2.get().setName("Amit Kumar Singh");
//		repository1.save(user2.get());
//		System.out.println(user2.get());
//
//		//get the data
//		List<User> users1= repository1.findAll();
//		users1.forEach(System.out::println);
//
//		//delete data
//		repository1.deleteById(1);

		//Lecture14 Custom Finder methods
		List<User> users=repository1.findByName("Amit Kumar Singh");
		users.forEach(System.out::println);
		List<User> users1=repository1.findByNameAndCity("Amit Kumar Singh","Nawada , Bihar");
		users1.forEach(System.out::println);
		List<User> users2=repository1.findByNameStartingWith("Amit");
		users2.forEach(System.out::println);
		List<User> users3=repository1.findByNameEndingWith("Singh");
		users3.forEach(System.out::println);
		List<User> users4=repository1.findByNameContaining("Kumar");
		users4.forEach(System.out::println);
	}

}
