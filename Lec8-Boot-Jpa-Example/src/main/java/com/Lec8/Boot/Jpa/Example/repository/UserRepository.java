package com.Lec8.Boot.Jpa.Example.repository;

import com.Lec8.Boot.Jpa.Example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
}
