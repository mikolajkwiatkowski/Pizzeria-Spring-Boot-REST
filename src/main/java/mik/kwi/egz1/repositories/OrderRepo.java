package mik.kwi.egz1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import mik.kwi.egz1.model.Order;
public interface OrderRepo extends JpaRepository<Order, Integer> {
}
