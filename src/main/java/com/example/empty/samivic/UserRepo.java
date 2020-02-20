package com.example.empty.samivic;

import com.example.empty.samivic.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UserRepo<T extends User> extends JpaRepository<T, Long> {


}

