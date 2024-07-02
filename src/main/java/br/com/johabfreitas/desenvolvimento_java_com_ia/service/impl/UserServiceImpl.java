package br.com.johabfreitas.desenvolvimento_java_com_ia.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import br.com.johabfreitas.desenvolvimento_java_com_ia.model.User;
import br.com.johabfreitas.desenvolvimento_java_com_ia.repository.UserRepository;
import br.com.johabfreitas.desenvolvimento_java_com_ia.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    //Construtor
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("User already exists");
        }
        
        return userRepository.save(userToCreate);
    }

}
