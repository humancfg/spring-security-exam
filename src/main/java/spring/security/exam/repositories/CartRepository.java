package spring.security.exam.repositories;

import com.example.springsecurityapplication.models.Cart;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    List<Cart> findByPersonId(int id);

    @Modifying
    @Query(value = "delete from product_cart where product_id=?1", nativeQuery = true)
    void deleteCartByProductId(int id);
}
