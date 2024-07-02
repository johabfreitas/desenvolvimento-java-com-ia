package br.com.johabfreitas.desenvolvimento_java_com_ia.service;

import br.com.johabfreitas.desenvolvimento_java_com_ia.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
