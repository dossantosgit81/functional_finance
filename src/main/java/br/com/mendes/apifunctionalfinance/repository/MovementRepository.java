package br.com.mendes.apifunctionalfinance.repository;

import br.com.mendes.apifunctionalfinance.model.Movement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovementRepository extends JpaRepository<Movement, Long>  {
}
