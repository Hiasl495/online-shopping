package edu.project.application.persistence.repositories;
import edu.project.application.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, String> {

    // @Query(value = "SELECT u.* FROM User u WHERE u.username = :userId",
    // nativeQuery = true)
    // User findByUsername(@Param("userId") String username);
}
