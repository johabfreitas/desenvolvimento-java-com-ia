package br.com.johabfreitas.desenvolvimento_java_com_ia.service.impl;



import org.springframework.stereotype.Service;

import br.com.johabfreitas.desenvolvimento_java_com_ia.model.User;
import br.com.johabfreitas.desenvolvimento_java_com_ia.repository.UserRepository;
import br.com.johabfreitas.desenvolvimento_java_com_ia.service.UserService;
import br.com.johabfreitas.desenvolvimento_java_com_ia.service.exception.NotFoundException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    //Construtor
    /*public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }*/

    @Override
    public User findById(Long id) {
        return this.userRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("User already exists");
        }
        
        return userRepository.save(userToCreate);
    }

}
