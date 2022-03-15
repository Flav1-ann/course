package eu.ensup.client_project.repository;

import eu.ensup.client_project.domaine.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findAllByUsername(String username);
    Optional<User> findByUsername(String username);
}
