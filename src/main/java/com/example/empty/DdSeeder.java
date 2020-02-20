package com.example.empty;

import com.example.empty.samivic.UserRepository;
import com.example.empty.samivic.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class DdSeeder implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(DdSeeder.class);

    public UserRepository userRepository;

    public DdSeeder(UserRepository imageRepository) {
        this.userRepository = imageRepository;
    }

    @Override
    public void run(String... args) throws Exception {
            /*LOGGER.info("Seeding DataBase... ");
            userRepository.save(new Image("Image 1"));
            imageRepository.save(new Image("Image 2"));
            imageRepository.save(new Image("Image 3"));
            imageRepository.save(new Image("Image 4"));
            imageRepository.save(new Image("Image 5"));
            imageRepository.save(new Image("Image 6"));
            imageRepository.save(new Image("Image 7"));*/

        userRepository.save(new User(7,"nnn", 15));
        /*userRepository.save(new User(2,"nnn", 25));
        userRepository.save(new User(3,"nnn", 35));
        userRepository.save(new User(4,"nnn", 45));
        userRepository.save(new User(5,"nnn", 55));
        userRepository.save(new User(6,"nnn", 65));*/


    }
}


