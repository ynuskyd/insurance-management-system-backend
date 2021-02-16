package com.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// controller dan gelenleri repoya iletecek
@Service
public class UserService {

    // userservice oluştuğunda içinde userReposirty oluşacak ve userService de kullanabilmek için.

    @Autowired
    UserRepository userRepository;

    //userRepository.save ile kayıt
    public void save(User user) {

        userRepository.save(user);

    }

    public List<User> findAll() {

        return userRepository.findAll();

    }

}
