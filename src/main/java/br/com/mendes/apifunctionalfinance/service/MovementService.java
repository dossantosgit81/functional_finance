package br.com.mendes.apifunctionalfinance.service;

import br.com.mendes.apifunctionalfinance.dto.MovementDto;
import br.com.mendes.apifunctionalfinance.repository.MovementRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovementService {

    private final MovementRepository movementRepository;

    public void create(MovementDto moviment){

    }

}
