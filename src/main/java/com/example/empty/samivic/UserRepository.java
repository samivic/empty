package com.example.empty.samivic;

import com.example.empty.samivic.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserRepository extends UserRepo<User> {
    //Optional<User> findByAgeLike(int age); /* ... */

    Iterable<User> findByEmailContaining(String ag);

    @Query(value = "select max(age) from user",nativeQuery = true)
    long findMaxAge();
}
