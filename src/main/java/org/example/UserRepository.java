package org.example;

import org.example.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
