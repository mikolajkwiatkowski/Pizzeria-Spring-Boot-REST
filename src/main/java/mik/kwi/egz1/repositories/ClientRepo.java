package mik.kwi.egz1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import mik.kwi.egz1.model.Client;
public interface ClientRepo extends JpaRepository<Client, Integer> {
}
