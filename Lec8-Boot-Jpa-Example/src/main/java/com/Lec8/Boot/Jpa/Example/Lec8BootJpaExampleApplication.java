package com.Lec8.Boot.Jpa.Example;

import com.Lec8.Boot.Jpa.Example.model.User;
import com.Lec8.Boot.Jpa.Example.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lec8BootJpaExampleApplication
{
	public static void main(String[] args)
	{
		ApplicationContext context= SpringApplication.run(Lec8BootJpaExampleApplication.class, args);
		UserRepository repository1 = context.getBean(UserRepository.class);
		User user=new User();
		user.setName("Vijay Prakash Singh");
		user.setCity("Nawada , Bihar");
		user.setStatus("I am java programmer");

		User user1=new User();
		user1.setName("Vijay Prakash");
		user1.setCity("Nawada");
		user1.setStatus("I am a programmer");
		repository1.save(user1);
		repository1.save(user);
	}

}
