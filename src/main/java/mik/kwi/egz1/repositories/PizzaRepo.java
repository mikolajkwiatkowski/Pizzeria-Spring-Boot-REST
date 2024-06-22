package mik.kwi.egz1.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import mik.kwi.egz1.model.Pizza;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;
@Repository
public interface PizzaRepo extends JpaRepository<Pizza, Integer> {

//po id
    Optional<Pizza> findByIdPizzy(Integer pizza_id);
    @Query("SELECT p FROM Pizza p ORDER BY p.price ASC")
    Page<Pizza> findByLowestPrice(Pageable pageable);
    @Query("SELECT p FROM Pizza p ORDER BY p.price ASC")
    List<Pizza> findByLowestPrice();






}
