package spring.security.exam.repositories;

import com.example.springsecurityapplication.models.Person;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByLogin(String login);
}
