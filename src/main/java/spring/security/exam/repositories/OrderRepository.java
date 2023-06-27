package spring.security.exam.repositories;

import com.example.springsecurityapplication.models.Order;
import com.example.springsecurityapplication.models.Person;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByPerson(Person person);
}
