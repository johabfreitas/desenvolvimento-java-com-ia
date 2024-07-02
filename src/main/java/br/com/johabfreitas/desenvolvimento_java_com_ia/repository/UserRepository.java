package br.com.johabfreitas.desenvolvimento_java_com_ia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.johabfreitas.desenvolvimento_java_com_ia.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccoutNumber(String accountNumber);
}
